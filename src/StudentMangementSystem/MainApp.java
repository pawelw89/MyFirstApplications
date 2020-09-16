package StudentMangementSystem;

import java.util.Scanner;

public class MainApp {

    public static void main(String[] args) {

        System.out.println("Enter number students to enroll: ");
        Scanner in = new Scanner(System.in);
        int numberOfStudents = in.nextInt();
        Student[] students = new Student[numberOfStudents];

        for (int i = 0; i<numberOfStudents; i++) {
            students[i] = new Student();
            students[i].enroll();
            students[i].payTuition();
        }

        for (int i = 0; i<students.length; i++) {
            System.out.println("\n" + students[i].toString());
        }

    }
}
