package Lesson11;

import java.math.BigDecimal;
import java.util.Scanner;

public class Bankomat implements Withdrawable{

    private BankingCard insertedCard;

    @Override
    public BigDecimal whithdraw(BigDecimal amount) {
        if(askPinCode()){
            //getAccountNumber form card
            //getBank name from card
            //check is INGBank has the same name as bank from card
            //find account number in INGBank
            //withdraw account by amount
            //return amount of money
            return null;
        } else {
            //print error message

            return null;
        }
    }

    private boolean askPinCode() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please inter you PIN: ");
        byte enteredPin = scanner.nextByte();
        return insertedCard.isCorrectPin(enteredPin);
    }

    public void insertCard (BankingCard card) {
        insertedCard = card;
    }

    public void endSession() {
        insertedCard = null;
    }
}
