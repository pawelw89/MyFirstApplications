package Lesson5;

public class test {
    public static void main(String[] args) {

        int[] numbers = {3, 8, -12, 9, 32, 10, -9};

        int min = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (min > numbers[i]) {
                min = numbers[i];
            }
        }
        System.out.println("Minimum number is " + min);
    }
}
