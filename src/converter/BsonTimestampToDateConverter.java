import org.bson.BsonTimestamp;
import org.springframework.core.convert.converter.Converter;
import org.springframework.data.convert.ReadingConverter;
import java.util.Date;

@ReadingConverter
public class BsonTimestampToDateConverter implements Converter<BsonTimestamp, Date> {

    @Override
    public Date convert(BsonTimestamp source) {
        return new Date(source.getValue() * 1000L);
    }
}