package Lesson15;

import java.util.ArrayList;
import java.util.List;

public class BasketOfNumbers {
    List<? super Number> numbers = new ArrayList<>();

    public void addNumber(Number number) {
        numbers.add(number);
    }

    public void printBasket() {
        System.out.println(numbers);
    }
}
