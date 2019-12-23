package Lesson11;

import java.math.BigDecimal;
import java.util.Scanner;

import Lesson11.account.Account;
import Lesson11.exceptions.*;

public class Bankomat implements Withdrawable, Wplatomat{

    private BankingCard insertedCard;

    @Override
    public BigDecimal withDraw(BigDecimal amount)
            throws NoCardException, BankNotFoundException, BankAccountNotFoundException, NotEnoughMoney, WrongPinException {
        if (askPinCode()) {
            String bankName = insertedCard.getBankName();
            Bank bank = BankRegistrator.getByName(bankName);
            int accountNumber = insertedCard.getAccountNumber();
            Account account = bank.getAccountByNumber(accountNumber);
            return account.withDraw(amount);
        }
        throw new WrongPinException("Entered pin is wrong!");
    }

    @Override
    public BigDecimal topUp(BigDecimal amount) throws WrongPinException, NoCardException, BankNotFoundException, BankAccountNotFoundException {
        if (askPinCode()) {
            String bankName = insertedCard.getBankName();
            Bank bank = BankRegistrator.getByName(bankName);
            int accountNumber = insertedCard.getAccountNumber();
            Account account = bank.getAccountByNumber(accountNumber);
            return account.topUp(amount);
        }
        throw new WrongPinException("Entered pin is wrong!");
    }

    private boolean askPinCode() throws NoCardException {
        if(insertedCard == null) {
            throw new NoCardException("Please, insert a card!");
        }
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter your pin: ");
        String enteredPin = scanner.nextLine();
        return insertedCard.isCorrectPin(enteredPin);
    }

    public void insertCard(BankingCard card) {
        insertedCard = card;
    }

    public void endSession(){
        insertedCard = null;
    }


}
