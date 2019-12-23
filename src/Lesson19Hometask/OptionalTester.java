package Lesson19Hometask;

import java.time.LocalDate;
import java.util.Optional;

public class OptionalTester {
    public static void main(String[] args) {

        Person jan = new Person("Jan", "Kowalski", 1999);
        Person piotr = new Person("Piotr", "Nowak", 2002);
        Person ola = new Person("Ola", "Kot", 1999);

        Optional<Person> optionalPerson = userName("Jan", "Kowalski", 1999);
        if (optionalPerson.isPresent()) {
            Person person = optionalPerson.get();
            System.out.println(person.getFirstName() + person.getLastName() + person.getBirthYear());
        } else {
            System.out.println("Person not found");
        }
    }

    private static Optional<Person> userName(String firstName, String lastName, int birthYear) {
        double random = Math.random();
        String firstLetter = String.valueOf(firstName.charAt(0));
        if (random < 0.5) {
            return Optional.of(new Person(firstLetter, lastName, birthYear));
        }
        return Optional.empty();
    }
}

