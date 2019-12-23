package Lesson15;

import Lesson14.Person;

import java.util.ArrayList;
import java.util.List;

public class GeneriksTester {
    public static void main(String[] args) {
        List integers = new ArrayList();
        integers.add (5);
        integers.add("java");
        integers.add(new Person("Jan", "Kowalski"));

        for (Object element : integers) {
            if(element instanceof Integer) {
                Integer i = (Integer) element;
            } else if (element instanceof String) {
                String s = (String) element;
            }
            //Person p = (Person) element;
        }

        List<String> strings = new ArrayList<>();

        Box<Integer> integerBox = new Box<>(10);
        Integer item = integerBox.getItem();
        System.out.println(item);

        Number number = Util.getOrDeafault(5,6);
        System.out.println(number);

        Number number2 = Util.getOrDeafault(5,6);
        System.out.println(number2);

        System.out.println("=============");

        System.out.println(Util.max(5, 6));
        System.out.println(Util.max(5.9, 6));
        System.out.println(Util.max(10L, 0xAA));

        BasketOfNumbers numbers = new BasketOfNumbers();
        numbers.addNumber(5);
        numbers.addNumber(0xAA);
        numbers.addNumber(1001);
        numbers.addNumber(5.01);

    }
}
