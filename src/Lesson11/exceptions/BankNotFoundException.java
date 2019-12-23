package Lesson11.exceptions;

public class BankNotFoundException extends Exception {

    public BankNotFoundException(String message) {
        super(message);
    }
}
