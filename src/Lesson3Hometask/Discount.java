package Lesson3Hometask;

import java.util.Scanner;

public class Discount {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Age");
        int age = scanner.nextInt();

        System.out.println("Type if regular");
        boolean regular = scanner.nextBoolean();

        if (age < 18)
            System.out.println("25% discount");
        else if (age > 65)
            System.out.println("10% discount");
        else if (regular)
            System.out.println("5% extra discount");
        else
            System.out.println("Normal price");

    }
}