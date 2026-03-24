/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DELL
 */
public class Transaction {

    private String state;
    private String timeStamp;
    private int amount;
    private int accountNumber;

    public Transaction(String state, String timeStamp, int amount, int accountNumber) {
        this.accountNumber = accountNumber;
        this.state = state;
        this.amount = amount;
        this.timeStamp = timeStamp;
    }
    //Transaction withdraw = new Transaction("Withdrawal", "now " ,this.balance, this.accountNumber);

    public void PrintReceipt() {
        System.out.println("Transaction: " + state);
        System.out.println("Amount: " + amount);
        System.out.println("Account: " + this.accountNumber);
        System.out.println("Time: " + timeStamp);
    }
}
