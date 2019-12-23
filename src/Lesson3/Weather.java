package Lesson3;

import java.util.Scanner;

public class Weather {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter temp: ");
        double temp = scanner.nextDouble();
        System.out.println("Type if rainy: ");
        boolean rainy = scanner.nextBoolean();

        if (rainy)
            System.out.println("Take umbrella");
        else if (temp > 30)
            System.out.println("Goto lake and swim");
        else
            System.out.println("Normal weather");
    }
}