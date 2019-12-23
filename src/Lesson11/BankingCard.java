package Lesson11;

public class BankingCard {
    private int cardNumber;
    private Person owner;
    private String pin;
    private int accountNumber;
    private String bankName;

    public BankingCard(int cardNumber, Person owner, String pin, int accountNumber, String bankName) {
        this.cardNumber = cardNumber;
        this.owner = owner;
        this.pin = pin;
        this.accountNumber = accountNumber;
        this.bankName = bankName;
    }

    public boolean isCorrectPin(String enteredPin) {
        return enteredPin.equals(pin);
    }

    public void changePin(String oldPin, String newPin) {
        if(isCorrectPin(oldPin)) {
            pin = newPin;
            System.out.println("Pin has been changed");
        } else {
            System.out.println("Incorrect current pin");
        }
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public String getBankName() {
        return bankName;
    }
}