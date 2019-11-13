package Lesson11;

public class INGBank extends Bank {

    private String name;

    private Address address;

    private Account[] accounts;

    private int lastAccountIndex;

    public INGBank (String name, Address address, Account account){
        this.name = name;
        this.address = address;
        accounts = new Account[100];
    }

    @Override
    protected String getName() {
        return name;
    }

    @Override
    protected Address getAddress() {
        return address;
    }

    public void addAccount (Account account) {
        accounts [lastAccountIndex] = account;
        lastAccountIndex++;
    }

    public Account getAccountByNumber(int accountNumber) {
        for (int i = 0; i < accounts.length; i++) {
            if (accounts[i].getLastAccountNumber() == accountNumber) {
                return accounts[i];
            }
        }
        return null;
    }
}
