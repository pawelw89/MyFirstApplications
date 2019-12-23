package Lesson11;

import java.util.HashSet;
import java.util.Set;

import Lesson11.account.Account;
import Lesson11.exceptions.BankAccountNotFoundException;

public class Bank {

    private String name;

    private Address address;

    private Set<Account> accounts = new HashSet<>();

    public Bank(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    protected String getName() {
        return name;
    }

    protected Address getAddress() {
        return address;
    }

    public void addAccount(Account account) {
        accounts.add(account);
    }

    public Account getAccountByNumber(int accountNumber) throws BankAccountNotFoundException {
        for (Account account : accounts) {
            if (account.getAccountNumber() == accountNumber) {
                return account;
            }
        }
        throw new BankAccountNotFoundException("Bank " +
                name + " does not contains account number " + accountNumber);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Bank bank = (Bank) o;

        if (name != null ? !name.equals(bank.name) : bank.name != null) {
            return false;
        }
        return address != null ? address.equals(bank.address) : bank.address == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (address != null ? address.hashCode() : 0);
        return result;
    }
}