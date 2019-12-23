package Lesson18Hometask;

import java.time.LocalDate;

public class Person {
    String firstName;
    String lastName;
    LocalDate birthDay;
    Sex sex;
    int salary;
    Adress adress;

    public Person(String firstName, String lastName, LocalDate birthDay, Sex sex, int salary, Adress adress) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDay = birthDay;
        this.sex = sex;
        this.salary = salary;
        this.adress = adress;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public LocalDate getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(LocalDate birthDay) {
        this.birthDay = birthDay;
    }

    public Sex getSex() {
        return sex;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public Adress getAdress() {
        return adress;
    }

    public void setAdress(Adress adress) {
        this.adress = adress;
    }

    @Override
    public String toString() {
        return firstName + " " +
               lastName + " " +
                birthDay + " " +
                sex + " " +
                salary + " zl " +
                adress;
    }
}

