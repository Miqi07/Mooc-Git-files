/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DELL
 */
public class Container {

    private int litres;

    public Container() {
        this.litres = 0;
    }

    public int contains() {
        return this.litres;
    }

    public void add(int amount) {
        if (amount > 0) {
            this.litres += amount;
            if (this.litres > 100) {
                this.litres = 100;
            }
        }
    }

    public void remove(int amount) {
        if (amount > 0) {
            this.litres -= amount;
            if (this.litres < 0) {
                this.litres = 0;
            }
        }
    }

    @Override
    public String toString() {
        return  + this.litres +"/100";
    }
}
