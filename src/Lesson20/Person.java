package Lesson20;

import lombok.Data;

@Student(age = 20, className = "Java Fundamentals")
@Data
public class Person {
    private final String firstName;
    private final String lastName;
}
