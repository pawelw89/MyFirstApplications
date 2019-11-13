package Lesson8;

public class CopyByValueDemo {
    public static void main(String[] args) {
        int number = 5;
        System.out.println("Number from main method: " + number);

        intExample(number);
        System.out.println("Number from main method: " + number);
    }

    private static void intExample(int number) {
        System.out.println(number);
        System.out.println("Number from intExampleMethod: " + number);
        number = 0;
        System.out.println("Number from intExampleMethod: " + number);
    }

    }

