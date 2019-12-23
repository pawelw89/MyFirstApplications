package Lesson11;

import Lesson11.exceptions.BankNotFoundException;

import java.util.HashSet;
import java.util.Set;

public class BankRegistrator {
    private static Set<Bank> banks = new HashSet<>();

    public static void registerBank(Bank bank) {
        banks.add(bank);
    }

    public static Bank getByName(String bankName) throws BankNotFoundException {
        for (Bank bank : banks) {
            if(bank.getName().equals(bankName)) {
                return bank;
            }
        }
        throw new BankNotFoundException("Bank with name: " + bankName + " not found!");
    }

}
