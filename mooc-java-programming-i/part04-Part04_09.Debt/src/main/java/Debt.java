/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DELL
 */
public class Debt {

    double balance;
    double InterestRate;

    public Debt(double initialBalance, double initialInterestrate) {
        balance = initialBalance;
        InterestRate = initialInterestrate;
    }

    public void printBalance() {
        System.out.println(this.balance);
    }

    public void waitOneYear() {
        this.balance = this.balance * this.InterestRate;
    }

}
