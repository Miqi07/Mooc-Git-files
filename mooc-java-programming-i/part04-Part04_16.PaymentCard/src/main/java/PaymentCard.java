/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DELL
 */
public class PaymentCard {

    private double balance;

    public PaymentCard(double balance) {
        this.balance = balance;
    }

    public void eatAffordably() {
        // write code here
        if (balance < 2.60) {

        } else {
            this.balance -= 2.60;
        }
    }

    public void eatHeartily() {
        // write code here
        if (balance < 4.60) {
             
        } else {
            this.balance -= 4.60;
        }
    }

    public void addMoney(double amount) {
        // write code here
        if (amount < 0) {
           return;
        }
        
        this.balance += amount;
        
        if (this.balance > 150) {
            this.balance = 150;
        }
    }

    @Override
    public String toString() {
        return "The card has a balance of " + balance + " euros";
    }

}
