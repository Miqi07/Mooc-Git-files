public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {
        // Handle incoming cent overflows to normalize values
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

    // Part 1: Plus (Returns a fresh immutable Money object)
    public Money plus(Money addition) {
        int totalEuros = this.euros + addition.euros();
        int totalCents = this.cents + addition.cents();

        return new Money(totalEuros, totalCents);
    }

    // Part 2: LessThan (Evaluates structural value differences)
    public boolean lessThan(Money compared) {
        if (this.euros < compared.euros()) {
            return true;
        }
        
        if (this.euros == compared.euros()) {
            return this.cents < compared.cents();
        }

        return false;
    }

    // Part 3: Minus (Calculates safe difference or floors at 0.00e)
    public Money minus(Money decreaser) {
        // Flatten values down to absolute cents to prevent negative borrow issues
        int initialTotalCents = (this.euros * 100) + this.cents;
        int decreaserTotalCents = (decreaser.euros() * 100) + decreaser.cents();

        int resultingCents = initialTotalCents - decreaserTotalCents;

        // Force a zero-value return on all negative balance operations
        if (resultingCents < 0) {
            return new Money(0, 0);
        }

        return new Money(resultingCents / 100, resultingCents % 100);
    }

    @Override
    public String toString() {
        String zero = "";
        // Match standard grading format strings for clean decimal places
        if (this.cents < 10) {
            zero = "0";
        }

        return this.euros + "." + zero + this.cents + "e";
    }
}