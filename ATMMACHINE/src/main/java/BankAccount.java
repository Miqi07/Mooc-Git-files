/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DELL
 */
public class BankAccount {

    private int accountNumber;
    private String ownerName;
    private double balance;

    public BankAccount(int accountNumber, String ownerName, double balance) {

        this.accountNumber = accountNumber;
        this.ownerName = ownerName;
        this.balance = balance;

    }

    public int getAccountNumber() {
        return this.accountNumber;
    }

    public String OwnerName() {
        return this.ownerName;
    }

    public double getBalance() {
        return this.balance;
    }

    public boolean Deposit(double amount) {
        if (amount > 0) {
            this.balance += amount;
            return true;
        } else {
            System.out.println("Deposit Transaction Failed");
            return false;
        }
    }

    public boolean withdraw(double amount) {
        if (amount > 0 && balance >= amount) {
            balance -= amount;
            return true;
        }
        return false;
    }

    public void Transfer(BankAccount target, double amount) {
        if (amount > 0 && amount <= this.balance) {
            target.Deposit(amount);
            this.balance -= amount;

            Transaction transfer = new Transaction(
                    "Transfer",
                    "now ",
                    (int) this.balance,
                    this.getAccountNumber());
            transfer.PrintReceipt();

        } else {
            System.out.println("Transfer Transaction failed");
        }
    }

}
