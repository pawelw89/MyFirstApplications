package Lesson10Hometask;

import java.time.LocalDate;

public class Person{

    private String firstName;
    private String lastName;
    private double birthDate;

    Person (String firstName, String lastName, double birthDate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
    }

    public Person() {
        String firstName;
        String lastName;
        double birthDate;
    }

    public double getBirthDate() {
        return birthDate;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setBirthDate(double birthDate) {
        this.birthDate = birthDate;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
