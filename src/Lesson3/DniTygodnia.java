package Lesson3;

import java.util.Scanner;

public class DniTygodnia {

    public static void man(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String today = scanner.next();
        switch (today) {
            case "Monday": System.out.println("1 day of week");
            case "Tuesday": System.out.println("2 day of week");
            case "Wendsday": System.out.println("3 day of week");
            case "Thursday": System.out.println("4 day of week");
            case "Friday": System.out.println("5 day of week");
            case "Saturday": System.out.println("6 day of week");
            case "Sunday": System.out.println("7 day of week");
                dafult:
                System.out.println("Wrong input");
        }
    }
}