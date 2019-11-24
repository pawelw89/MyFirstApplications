package Lesson13;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListTester {
    public static void main(String[] args) {
        List<String> strings = new LinkedList<>();
        strings.add("one");
        strings.add("two");
        strings.add("three");
        strings.add("five");
        strings.add("8");

        strings.add(0, "ten");
        strings.set(5, "42");

        for (String string : strings) {
            System.out.println(string);
        }

        List<String> subStrings = strings.subList(0, 3);
        System.out.println("======================");

        for (String string : strings) {
            System.out.println(string);
        }

        System.out.println(subStrings.get(1));
    }
}
