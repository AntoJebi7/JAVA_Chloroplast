package Concepts;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Date_Time {
    public static void main(String[] args) {
        // localDate, LocalTime, LocalDateTime, UTC Timestamp

        LocalDate today = LocalDate.now();
        LocalTime time = LocalTime.now();
        LocalDateTime dateTime = LocalDateTime.of(today, time);
        Instant instant = Instant.now();

        // custom format
        LocalDateTime dateTime1 = LocalDateTime.now();
        DateTimeFormatter formatter =
                DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        String newDate = dateTime1.format(formatter);

        // custom date time object
        LocalDate date = LocalDate.of(2024,12,25);
        LocalDateTime dateTime2 = LocalDateTime.of(2024,
                12,25,12,0,0);

        System.out.println(time);
        System.out.println(today);
        System.out.println(dateTime);
        System.out.println(instant); // current date and time

        System.out.println(newDate);
        System.out.println(date);
        System.out.println(dateTime2);
    }
}
