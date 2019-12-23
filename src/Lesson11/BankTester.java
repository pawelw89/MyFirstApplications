package Lesson11;

import java.math.BigDecimal;

import Lesson11.account.Account;
import Lesson11.account.DebitAccount;
import Lesson11.exceptions.*;

public class BankTester {
    public static void main(String[] args) {

        Bank ing = new Bank("ING", new Address(36001, "Krakow", "Centralna", 1));
        BankRegistrator.registerBank(ing);
        Account debitAccount = new DebitAccount();
        ing.addAccount(debitAccount);
        Person jan = new Person("Jan", "Kowalski");
        BankingCard card = new BankingCard(1, jan, "0000", debitAccount.getAccountNumber(), ing.getName());

        Bankomat atm = new Bankomat();
        atm.insertCard(card);
        try {
            atm.withDraw(BigDecimal.TEN);
        } catch (BankNotFoundException | BankAccountNotFoundException | NotEnoughMoney | WrongPinException | NoCardException e) {
            System.out.println(e.getMessage());
        }
    }
}