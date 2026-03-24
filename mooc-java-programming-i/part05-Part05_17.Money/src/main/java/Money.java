
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros = euros + cents / 100;
            cents = cents % 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return this.euros;
    }

    public int cents() {
        return this.cents;
    }

    public String toString() {
        String zero = "";
        if (this.cents < 10) {
            zero = "0";
        }

        return this.euros + "." + zero + this.cents + "e";
    }

    public Money plus(Money addition) {

        Money newMoney = new Money(addition.euros + this.euros, addition.cents + this.cents);
        return newMoney;
    }

    public boolean lessThan(Money compared) {
        int minuseuros = this.euros - compared.euros();//30
        int minuscents = this.cents - compared.cents();//23

        if (minuscents < 0) {
            minuscents += 100;
            minuseuros -= 1;
        }
        if (minuseuros < 0) {
            return true;
        }
        return false;
    }

    public Money minus(Money decreaser) {

        int euroDiff = this.euros - decreaser.euros;//10-0
        int centDiff = this.cents - decreaser.cents;//0-

        if (centDiff < 0) {
            centDiff += 100;
            euroDiff -= 1;

        }
        if (this.euros < 0) {
            return new Money(0, 0);
        }
        return new Money(euroDiff, centDiff);
    }
}
