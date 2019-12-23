package Lesson18Hometask;

import java.time.LocalDate;
import java.util.List;

public class Java8Tester {
    public static void main(String[] args) {

        Person jan = new Person("Jan", "Kowalski", LocalDate.of(1990, 12, 1),
                Sex.MAN, 2500, new Adress("Kraków"));
        Person piotr = new Person("Piotr", "Nowak", LocalDate.of(1950, 7, 1),
                Sex.MAN, 2700, new Adress("Kraków"));
        Person rafal = new Person("Rafal", "Konieczny", LocalDate.of(2008, 6, 3),
                Sex.MAN, 1900, new Adress("Poznań"));
        Person patrycja = new Person("Patrycja", "Stafaniuk", LocalDate.of(2010, 3, 24),
                Sex.WOMAN, 1200, new Adress("Wrocław"));
        Person renata = new Person("Renata", "Piłsudska", LocalDate.of(1968, 11, 21),
                Sex.WOMAN, 3700, new Adress("Warszawa"));
        Person krystyna = new Person("Krystyna", "Borzęcka", LocalDate.of(1995, 4, 16),
                Sex.WOMAN, 3300, new Adress("Kraków"));

        List<Person> people = List.of(jan, piotr, rafal, patrycja, renata, krystyna);

        people.forEach(System.out::println);

        System.out.println("All men under 65 years:");

        }
    }
