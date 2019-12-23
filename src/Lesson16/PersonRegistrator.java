package Lesson16;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class PersonRegistrator {
    private static Set<Person> people = new HashSet<>();

    static void registerPerson(Person... persons) {
        Collections.addAll(people, persons);
    }

    static Person findByPesel(String pesel) throws PersonNotFoundException {
        for (Person person : people) {
            if (pesel.equals(person.getPesel())) {
                return person;
            }
        }
        throw new PersonNotFoundException("Can't find a person by pesel: " + pesel);
    }
}
