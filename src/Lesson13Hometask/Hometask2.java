package Lesson13Hometask;

import java.util.LinkedList;
import java.util.List;

public class Hometask2 {
    public static void main(String[] args) {
        List<Integer> intigers = new LinkedList<>();
        for (int i = 0; i < 100_000; i++);

        intigers.add (0,24);

        System.out.println(System.currentTimeMillis());

        intigers.get(0);

        System.out.println(System.currentTimeMillis());
    }
}
