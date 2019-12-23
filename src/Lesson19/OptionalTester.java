package Lesson19;


import Lesson16.PersonNotFoundException;

import java.util.Optional;

public class OptionalTester {
    public static void main(String[] args) throws PersonNotFoundException {
        Optional<String> optionalS = Optional.of("Java");
        String string = optionalS.get();
        System.out.println(string);
        System.out.println(optionalS.orElse("Default"));

        optionalS = Optional.empty();
//        string = optionalS.get();
//        System.out.println(string);
        System.out.println(optionalS.orElse("Default"));

        Person person = findByFirstName("Jan");
        if (person != null) {
            System.out.println(person.getLastName());
        } else {
            System.out.println("Person not found");
        }

        Optional<Person> optionalPerson = findByFirstAndLastName("Jan", "Kowalski");
        if (optionalPerson.isPresent()) {
            Person person1 = optionalPerson.get();
            System.out.println(person1.getLastName() + person1.getFirstName());
        } else {
            System.out.println("Person not found");
        }

        optionalPerson.ifPresent(person1 -> System.out.println(person1.getLastName() + " " + person1.getFirstName()));

        Person person2 = optionalPerson.orElse(new Person("Ola", "Nowak"));
        Person person3 = optionalPerson.orElseGet(() -> new Person("Grzegorz", "Nowak"));
        //Person person4 = optionalPerson.orElseThrow(() -> new PersonNotFoundException("Person not found!!!"));

        String lastName = optionalPerson
                .map(Person::getLastName)
                .orElse("NoName");
        System.out.println(lastName);

        Optional<Optional<String>> optionalString = Optional.of(Optional.of("JAVA"));

        System.out.println(Optional.of("string")
                .map(s -> Optional.of("STRING")));

        System.out.println(Optional.of("string")
                .flatMap(s -> Optional.of("STRING")));


    }

    private static Person findByFirstName(String firstName) {
        double random = Math.random();
        if (random < 0.5) {
            return new Person(firstName, "Kowalski");
        }
        return null;
    }

    private static Optional<Person> findByFirstAndLastName(String firstName, String lastName) {
        double random = Math.random();
        if (random < 0.5) {
            return Optional.of(new Person(firstName, lastName));
        }
        return Optional.empty();
    }
}