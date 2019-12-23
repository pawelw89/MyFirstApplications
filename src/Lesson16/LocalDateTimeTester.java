package Lesson16;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class LocalDateTimeTester {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        System.out.println(today);
        LocalDate anotherDate = LocalDate.of(2019, 12, 31);
        System.out.println(anotherDate);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MMMM yyyy EEEE e");
        System.out.println(formatter.format(anotherDate));
        System.out.println(today.isBefore(anotherDate));

        LocalDate modifiedTodayDate = today.plus(10, ChronoUnit.DAYS);
        System.out.println(modifiedTodayDate);

        LocalTime now = LocalTime.now();
        System.out.println(now);
        DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        System.out.println(timeFormatter.format(now));

        LocalDateTime dateTime = LocalDateTime.of(2020, 1, 1, 0, 1);
        System.out.println(dateTime);
        System.out.println(DateTimeFormatter.ISO_WEEK_DATE.format(dateTime));

        LocalTime parsedTime = LocalTime.parse("12:21:01", timeFormatter);
        System.out.println(parsedTime);
    }
}
