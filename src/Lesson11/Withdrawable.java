package Lesson11;

import Lesson11.exceptions.*;

import java.math.BigDecimal;

public interface Withdrawable {
    BigDecimal withDraw(BigDecimal amount)
            throws NoCardException, BankNotFoundException, BankAccountNotFoundException, NotEnoughMoney, WrongPinException;
}
