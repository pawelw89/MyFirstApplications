package BankApplication;

import java.util.Scanner;

public class BankAccount {

    int balance;
    int prevoiusTransaction;
    String customerName;
    String customerID;

    BankAccount(String custName, String custID) {
        customerName = custName;
        customerID = custID;
    }

    void deposit(int amount) {
        if (amount != 0) {
            balance = balance + amount;
            prevoiusTransaction = amount;
        }
    }

    void withdraw(int amount) {
        if (amount != 0) {
            balance = balance - amount;
            prevoiusTransaction = -amount;
        }
    }

    void getPreviousTransaction() {
        if (prevoiusTransaction > 0) {
            System.out.println("Deposited: " + prevoiusTransaction);
        } else if (prevoiusTransaction < 0) {
            System.out.println("Withdrawn: " + Math.abs(prevoiusTransaction));
        } else {
            System.out.println("No transaction occured");
        }
    }

    void showMenu() {

        char option = '\0';
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome " + customerName);
        System.out.println("Your ID is " + customerID);
        System.out.println("\n");
        System.out.println("A. Check balance");
        System.out.println("B. Deposit");
        System.out.println("C. Withdraw");
        System.out.println("D. Prevois transaction");
        System.out.println("E. Exit");

        do {
            System.out.println("===================================================");
            System.out.println("Enter the option");
            System.out.println("===================================================");
            option = scanner.next().charAt(0);

            switch (option) {

                case 'A':
                    System.out.println("-----------------------------------------------");
                    System.out.println("Balance: " + balance);
                    System.out.println("-----------------------------------------------");
                    System.out.println("\n");
                    break;

                case 'B':
                    System.out.println("-----------------------------------------------");
                    System.out.println("Enter the amount to deposit:");
                    System.out.println("-----------------------------------------------");
                    int amount = scanner.nextInt();
                    deposit(amount);
                    System.out.println("\n");
                    break;

                case 'C':
                    System.out.println("-----------------------------------------------");
                    System.out.println("Enter the amount to withdraw:");
                    System.out.println("-----------------------------------------------");
                    int amount2 = scanner.nextInt();
                    deposit(amount2);
                    System.out.println("\n");
                    break;

                case 'D':
                    System.out.println("-----------------------------------------------");
                    getPreviousTransaction();
                    System.out.println("-----------------------------------------------");
                    System.out.println("\n");
                    break;

                case 'E':
                    System.out.println("=====================================================");
                    break;

                default:
                    System.out.println("Invalid option! Please enter the option again");
                    break;

            }

        } while (option != 'E') ;

        System.out.println("Thank You for using out services");
    }
}

