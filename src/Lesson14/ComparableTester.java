package Lesson14;

import java.util.Set;
import java.util.TreeSet;

public class ComparableTester {
    public static void main(String[] args) {

        Person kowalski = new Person ("Jan", "Kowalski");
        Person nowak = new Person("Janusz", "Nowak");
        Person nowak2 = new Person("Piotrek", "Nowak");
        Person sereda = new Person ("Oleg", "Sereda");

        Set<Person> persons = new TreeSet<>();
        persons.add(kowalski);
        persons.add(nowak);
        persons.add(nowak2);
        persons.add(sereda);

        System.out.println(persons);
    }
}
