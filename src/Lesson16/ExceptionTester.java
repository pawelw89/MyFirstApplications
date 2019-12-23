package Lesson16;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class ExceptionTester {
    public static void main(String[] args) {
        try {
            printFile("C:\\1\\test.txt");
        } catch (IOException e) {
            System.out.println("File can't be read, because of: " + e.getMessage());
        }
        System.out.println("Application still running after exception!");

        Person first = new Person("1");
        Person second = new Person("2");
        Person third = new Person("3");

        PersonRegistrator.registerPerson(first, second, third);

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Enter pesel number: ");
            String pesel = scanner.nextLine();
            try {
                Person person = PersonRegistrator.findByPesel(pesel);
                System.out.println(person);
                break;
            } catch (PersonNotFoundException e) {
                System.out.println("Can't find person! " + e.getMessage());
                System.out.println("Check pesel number and try again!");
            }
        }
    }

    private static void printFile(String fileName) throws IOException {
        FileInputStream inputStream = new FileInputStream(fileName);
        BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);
        byte[] bytes = bufferedInputStream.readAllBytes();
        for (byte aByte : bytes) {
            System.out.println((char) aByte);
        }
        bufferedInputStream.close();
        inputStream.close();
    }

}
