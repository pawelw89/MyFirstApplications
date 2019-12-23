package Lesson20;

import Lesson15.Box;

public class VarArgsExample {
    public static void main(String[] args) {
        print("test");
        print();
        print("test", "java");
        print("test", "java", "more");

        checkBoxes(new Box<>("test"));
    }

    private static void print(String... text) {
        for (String s : text) {
            System.out.println(s);
        }
    }

    @SafeVarargs
    private static void checkBoxes(Box<String>... boxes) {
        for (Box<String> box : boxes) {
            System.out.println(box.getItem());
        }
    }

}