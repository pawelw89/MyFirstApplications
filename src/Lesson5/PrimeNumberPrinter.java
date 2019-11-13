package Lesson5;

public class PrimeNumberPrinter {

    public static void main(String[] args) {
        System.out.print("Prime numbers: " + 2 + " " );
        for (int i=3; i<100; i++) {
            boolean isPrime = true;
            for (int j=2; j < i; j++) {
                if (i%j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if(isPrime) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
}
