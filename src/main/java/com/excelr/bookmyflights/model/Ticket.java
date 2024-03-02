package com.excelr.bookmyflights.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Document(collection = "tickets")
public class Ticket {
    @Id
    private String ticketId;
    private String flightId;
    private String passengerId;
    private String seatClass;
    private String seatNumber;
    private String price;
    private int checkedInBagsAmount;
}
