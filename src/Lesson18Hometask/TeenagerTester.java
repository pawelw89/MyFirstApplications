package Lesson18Hometask;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class TeenagerTester implements PersonTester {
    @Override
    public boolean test(Person person) {
        return person.getBirthDay()
                .plus(18, ChronoUnit.YEARS)
                .isAfter(LocalDate.now());
    }
}
