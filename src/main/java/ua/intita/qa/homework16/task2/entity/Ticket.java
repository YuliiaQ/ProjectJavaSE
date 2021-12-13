package ua.intita.qa.homework16.task2.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import java.time.LocalDateTime;

@AllArgsConstructor
@Getter
@Setter
@ToString
public class Ticket {
    private String ticketId;
    private String placeOfDeparture;
    private String placeOfDestination;
    private String dateAndTime;
    private String price;
    private String dateTime;
}
