package SchoolManagementSystem;

import java.util.ArrayList;
import java.util.List;

public class MainApp {

    public static void main(String[] args) {
        Teacher jan = new Teacher(1, "Jan", 3200);
        Teacher anna = new Teacher(2, "Anna", 3700);
        Teacher mariusz = new Teacher(3, "Mariusz", 2900);

        List<Teacher> teacherList = new ArrayList<>();
        teacherList.add(jan);
        teacherList.add(anna);
        teacherList.add(mariusz);

        Student jozef = new Student(1, "Józef", 3);
        Student krystyna = new Student(2, "Krystyna", 2);
        Student joanna = new Student (3, "Joanna", 5);

        List<Student> studentList = new ArrayList<>();
        studentList.add(jozef);
        studentList.add(krystyna);
        studentList.add(joanna);

        School sms = new School(teacherList, studentList);
        System.out.println("SMS has earned " + sms.getTotalMoneyEarned() + " zl");

        jozef.payFees(3000);
        System.out.println("SMS has earned " + sms.getTotalMoneyEarned() + " zl");
        krystyna.payFees(6000);
        System.out.println("SMS has earned " + sms.getTotalMoneyEarned() + " zl");

        System.out.println("----------------- Payday for teachers -----------------");
        jan.receiveSalary(jan.getSalary());
        System.out.println("SMS has spent for salary to " + jan.getName() + " " + jan.getSalary() + " zl and now has "
                + sms.getTotalMoneyEarned() + " zl");
        anna.receiveSalary(anna.getSalary());
        System.out.println("SMS has spent for salary to " + anna.getName() + " " + anna.getSalary() + " zl and now has "
                + sms.getTotalMoneyEarned() + " zl");

        System.out.println(jozef.toString());
        System.out.println(jan.toString());

    }
}
