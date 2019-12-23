package Lesson11.exceptions;

public class WrongPinException extends Exception {

    public WrongPinException(String message) {
        super(message);
    }
}
