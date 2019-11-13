package Lesson11;

import java.math.BigDecimal;

public class debitAccount extends Account {

    private BigDecimal balance;

    public debitAccount() {
        super();
        balance = BigDecimal.ZERO;
    }

    @Override
    public BigDecimal topUp(BigDecimal amount) {
        if(amount.compareTo(BigDecimal.ZERO) >= 0){
            balance = balance.add(amount);
        } else {
            System.out.println("Can't top up on negative amount");

        }

        return balance;
    }

    @Override
    public BigDecimal withdrawUp(BigDecimal amount) {
        if (balance.compareTo(amount) >= 0) {
            balance = balance.subtract(amount);
        } else {
            System.out.println("Not enaugh money");
        }
            return null;

        }
    }