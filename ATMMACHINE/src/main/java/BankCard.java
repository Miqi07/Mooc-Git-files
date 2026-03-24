/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author DELL
 */
public class BankCard {

    private int cardNumber;
    private int pin;
    private BankAccount account;

    public BankCard(int cardNumber, byte pin, BankAccount account) {

        this.cardNumber = cardNumber;
        this.pin = pin;
        this.account = account;

    }

  public boolean checkPin(byte enteredPin) {
    return this.pin == enteredPin;
}

    public BankAccount getAccount() {

        return this.account;
    }
}
