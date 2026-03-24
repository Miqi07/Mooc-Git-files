/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DELL
 */
import java.util.Scanner;

public class ATM {

    private BankCard currentcard;
    private double cashInsideATM;
    private int transactionCount;

    public ATM(BankCard currentcard, double cashInsideATM, int transactionCount) {

        this.transactionCount = 0;
        this.currentcard = currentcard;
        this.transactionCount = transactionCount;
        this.cashInsideATM = cashInsideATM;

    }

    public void InsertCard(BankCard card) {

        this.currentcard = card;
        this.cashInsideATM = this.currentcard.getAccount().getBalance();
    }

    public void withdraw(double amount) {
        BankAccount acc = currentcard.getAccount();

        if (acc.withdraw(amount)) {

            Transaction t = new Transaction(
                    "withdraw",
                    "now",
                    (int) amount,
                    acc.getAccountNumber()
            );

            t.PrintReceipt();
        } else {
            System.out.println("Withdraw failed");
        }
    }

    public void deposit(double amount) {
        this.currentcard.getAccount().Deposit(amount);
        this.transactionCount++;
    }

    public double checkBalance() {
        return this.currentcard.getAccount().getBalance();
    }

    public void transfer(BankAccount target, double amount) {
        this.transactionCount++;
        this.currentcard.getAccount().Transfer(target, amount);
    }

    public BankCard ejectCard() {
        return this.currentcard;
    }

    public boolean authenticate() {
        Scanner scan = new Scanner(System.in);

        int attempts = 0;

        while (attempts < 3) {
            System.out.print("Enter PIN: ");
            byte enteredPin = scan.nextByte();

            if (currentcard.checkPin(enteredPin)) {
                System.out.println("Correct PIN");
                return true;
            } else {
                System.out.println("Wrong PIN");
            }

            attempts++;
        }

        System.out.println("Card blocked");
        return false;
    }
}
