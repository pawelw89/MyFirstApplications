package Lesson4Hometask;

public class Fibonacci {
    public static void main(String[] args) {

        int[] ints = new int[100];
        ints[0] = 0;
        ints[1] = 1;

        for (int n = 2; n<ints.length; n++) {
            ints[n] = ints[n - 1] + ints[n - 2];
        }

        for (int n = 0; n < ints.length; n++) {
            System.out.print(ints[n] + " ");
        }
    }
}
