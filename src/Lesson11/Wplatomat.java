package Lesson11;

import Lesson11.exceptions.BankAccountNotFoundException;
import Lesson11.exceptions.BankNotFoundException;
import Lesson11.exceptions.NoCardException;
import Lesson11.exceptions.WrongPinException;

import java.math.BigDecimal;

public interface Wplatomat {
    public BigDecimal topUp (BigDecimal amount) throws WrongPinException, NoCardException, BankNotFoundException, BankAccountNotFoundException;
}
