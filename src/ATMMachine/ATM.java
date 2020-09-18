package ATMMachine;

import java.util.Scanner;

public class ATM {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Bank theBank = new Bank ("mBank");

        User aUser = theBank.addUser("Piotr", "Nowak", "1234");

        Account newAccount = new Account ("My account", aUser, theBank);
        theBank.addAccount(newAccount);
        theBank.addAccount(newAccount);

        User curUser;
        while(true){
            curUser = ATM.mainMenuPrompt(theBank, sc);

            ATM.printUserMenu(curUser, sc);
        }

    }

    public static User mainMenuPrompt(Bank theBank, Scanner sc) {
        String userID;
        String pin;
        User authUser;

        do {
            System.out.printf("\nWelcome to %s\n\n", theBank.getName());
            System.out.print("Enter user ID: ");
            userID = sc.nextLine();
            System.out.print("Enter the pin ");
            pin = sc.nextLine();

            authUser = theBank.userLogin(userID, pin);
            if (authUser == null) {
                System.out.println("Incorret user ID/PIN combination. " + "Please try again");
            }
        } while(authUser == null);

        return authUser;
    }

    public static void printUserMenu(User theUser, Scanner sc) {
        theUser.printAccountSummary();

        int choice;

        do {
            System.out.printf("Welcome %s, what would you like to do?", theUser.getFirstName();)
            System.out.println("\n 1 Show account history ");
            System.out.println("\n 2 Withdrawl");
            System.out.println("\n 3 Deposit");
            System.out.println("\n 4 Transfer");
            System.out.println("\n 5 Quit");
            System.out.println();
            System.out.println("Enter choice: ");
            choice = sc.nextInt();

            if (choice < 1 || choice > 5) {
                System.out.println("Invalid choice. Please choose 1-5");
            }
        } while (choice < 1 || choice > 5);

        switch (choice) {
            case 1:
                ATM.showTransitionHistory(theUser,sc);
                break;
            case 2:
                ATM.withdrawlFunds(theUser, sc);
                break;
            case 3:
                ATM.depositFunds(theUser, sc);
            case 4:
                ATM.transferFunds(theUser,sc);
                break;
        }
        if (choice != 5) {
            ATM.printUserMenu(theUser, sc);
        }
    }

    public static void showTransitionHistory(User theUser, Scanner sc) {
        int theAcct;

        do {
            System.out.printf("Enter the number (1-%d) of the account" + " whole transaction you want to see: ",
                    theUser.numAccounts());
            theAcct = sc.nextInt()-1;
            if (theAcct < 0 || theAcct >= theUser.numAccounts()) {
                System.out.println("Invalid account. Please try again.");
            }

        } while (theAcct < 0 || theAcct >= theUser.numAccounts());

        theUser.printAcctTransHistory(theAcct);
    }
}
