package Lesson11.account;

import Lesson11.exceptions.NotEnoughMoney;

import java.math.BigDecimal;

public abstract class Account {
    private static int lastAccountNumber = 0;

    private int accountNumber;

    public Account() {
        accountNumber = lastAccountNumber + 1;
        lastAccountNumber++;
    }

    public abstract BigDecimal topUp(BigDecimal amount);

    public abstract BigDecimal withDraw(BigDecimal amount) throws NotEnoughMoney;

    public int getAccountNumber() {
        return accountNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Account account = (Account) o;

        return accountNumber == account.accountNumber;
    }

    @Override
    public int hashCode() {
        return accountNumber;
    }
}
