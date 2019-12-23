package Lesson18;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class LambdaTester {
    public static void main(String[] args) {
        Person kowalski = new Person("Jan", "Kowalski",
                LocalDate.of(2000, 1, 1));

        PersonTester tester = new TeenagerTester();
        System.out.println(testPerson(kowalski, tester));

        PersonTester personTester = new PersonTester() {
            @Override
            public boolean test(Person person) {
                return person.getBirthDay()
                        .plus(18, ChronoUnit.YEARS)
                        .isAfter(LocalDate.now());
            }
        };
        System.out.println(testPerson(kowalski, personTester));

        PersonTester kowalskiTester = new PersonTester() {
            @Override
            public boolean test(Person person) {
                return "Kowalski".equals(person.getLastName());
            }
        };
        System.out.println(testPerson(kowalski, kowalskiTester));

        System.out.println(testPerson(kowalski, new PersonTester() {
            @Override
            public boolean test(Person person) {
                return "Kowalski".equals(person.getLastName());
            }
        }));

        System.out.println(testPerson(kowalski, (Person person) -> {
            return "Kowalski".equals(person.getLastName());
        }));

        System.out.println(testPerson(kowalski, (person) -> {
            return "Kowalski".equals(person.getLastName());
        }));

        System.out.println(testPerson(kowalski, person -> "Kowalski".equals(person.getLastName())));
        System.out.println(testPerson(kowalski, person -> "Jan".equals(person.getFirstName())));
        System.out.println(testPerson(kowalski, person -> person.getBirthDay().isAfter(LocalDate.of(1999, 12, 31))));

        System.out.println(testPersonWithPredicate(kowalski, person -> person.getBirthDay().isAfter(LocalDate.of(1999, 12, 31))));

        consumePerson(kowalski, person -> System.out.println(person.getLastName()));
        consumePerson(kowalski, person -> System.out.println(person));
        consumePerson(kowalski, System.out::println);

        Person nowak = createPerson(() -> new Person("Ola", "Nowak", LocalDate.now()));
        System.out.println(nowak);

        Person newPerson = createPerson(() -> new Person());
        Person newPerson2 = createPerson(Person::new);
        System.out.println(newPerson);

        System.out.println(dateFromPerson(kowalski, person -> person.getBirthDay().plus(18, ChronoUnit.YEARS)));
    }

    private static boolean testPerson(Person person, PersonTester tester) {
        return tester.test(person);
    }

    private static boolean testPersonWithPredicate(Person person, Predicate<Person> predicate) {
        return predicate.test(person);
    }

    private static void consumePerson(Person person, Consumer<Person> consumer) {
        consumer.accept(person);
    }

    private static Person createPerson(Supplier<Person> supplier) {
        return supplier.get();
    }

    private static LocalDate dateFromPerson(Person person, Function<Person, LocalDate> function) {
        return function.apply(person);
    }

}
