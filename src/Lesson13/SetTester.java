package Lesson13;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetTester {
    public static void main(String[] args) {
        Set<String> strings = new HashSet<>();
        strings.add("first");
        strings.add("second");
        strings.add("third");

        System.out.println(strings);

        strings.add("first");
        System.out.println(strings);

        System.out.println(strings.contains("first"));
        System.out.println(strings.contains("fourth"));

        List<Integer> numbers = List.of(1, 2, 3, 5, 8, 13, 15, 16, 16, 16, 17, 18);
        System.out.println(numbers);
        Set<Integer> integerSet = new HashSet<>(numbers);
        System.out.println(integerSet);
    }
}
