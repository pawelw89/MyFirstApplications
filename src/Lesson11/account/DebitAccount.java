package Lesson11.account;

import Lesson11.exceptions.NotEnoughMoney;
import java.math.BigDecimal;

public class DebitAccount extends Account {

    private BigDecimal balance;

    public DebitAccount() {
        super();
        balance = BigDecimal.ZERO;
    }

    @Override
    public BigDecimal topUp(BigDecimal amount) {
        if(amount.compareTo(BigDecimal.ZERO) >= 0) {
            balance = balance.add(amount);
        } else {
            System.out.println("Cant top up on negative amount");
        }
        return balance;
    }

    @Override
    public BigDecimal withDraw(BigDecimal amount) throws NotEnoughMoney {
        if(balance.compareTo(amount) >= 0) {
            return balance.subtract(amount);
        }
        throw new NotEnoughMoney("Not enough money! Current balance: " + balance);
    }
}