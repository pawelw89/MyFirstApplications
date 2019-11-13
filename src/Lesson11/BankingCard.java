package Lesson11;

public class BankingCard {
    private int cardNumber;
    private Person owner;
    private byte pin;
    private int accountNumber;
    private String bankName;

    public BankingCard(int cardNumber, Person owner, byte pin, int accountNumber, String bankName) {
        this.cardNumber = cardNumber;
        this.owner = owner;
        this.pin = pin;
        this.accountNumber = accountNumber;
        this.bankName = bankName;
    }

    public boolean isCorrectPin (byte enteredPin) {
        return enteredPin == pin;
    }

    public void changePin (byte oldPin, byte newPin) {
        if (isCorrectPin(oldPin)) {
            pin = newPin;
            System.out.println("Pin has been changed");
        } else {
            System.out.println("Incorrect current PIN");
        }
    }

    public int getAccountNumber () {
        return accountNumber;
    }

    public String getBankName() {
        return bankName;
    }
}
