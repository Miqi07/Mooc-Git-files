public class Debt {
    // 1. Declare the double-typed private instance variables
    private double balance;
    private double interestRate;

    // 2. Create the constructor to initialize balance and interest rate
    public Debt(double initialBalance, double initialInterestRate) {
        this.balance = initialBalance;
        this.interestRate = initialInterestRate;
    }

    // 3. Method to print the current balance
    public void printBalance() {
        System.out.println(this.balance);
    }

    // 4. Method to advance time by one year and grow the debt amount
    public void waitOneYear() {
        this.balance = this.balance * this.interestRate;
    }
}