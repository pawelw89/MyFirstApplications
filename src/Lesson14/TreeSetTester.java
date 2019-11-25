package Lesson14;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetTester {
    public static void main(String[] args) {
        TreeSet<String> strings = new TreeSet<>();
        strings.add("first");
        strings.add("second");
        strings.add("third");
        strings.add("last");

        System.out.println(strings);
        System.out.println(strings.descendingSet());
        System.out.println(strings.headSet("last", true));
        System.out.println(strings.tailSet("last", false));
    }
}
