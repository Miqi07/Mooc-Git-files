
public class MainProgram {

    public static void main(String[] args) {

        // Create accounts
        BankAccount acc1 = new BankAccount(1001, "Imran", 500);
        BankAccount acc2 = new BankAccount(1002, "Ali", 300);

        // Create card (NOTE: your constructor uses byte for pin)
        BankCard card1 = new BankCard(1111, (byte) 1234, acc1);

        // Create ATM (your constructor requires all 3 parameters)
        ATM atm = new ATM(card1, 1000, 0);

        System.out.println("=== START TEST ===");

        // Insert card
        atm.InsertCard(card1);

        // Check balance
        System.out.println("\n-- Check Balance --");
        System.out.println("Balance: " + atm.checkBalance());

        // Deposit
        System.out.println("\n-- Deposit 200 --");
        atm.deposit(200);
        System.out.println("Balance: " + atm.checkBalance());

        // Withdraw
        System.out.println("\n-- Withdraw 100 --");
        atm.withdraw(100);
        System.out.println("Balance: " + atm.checkBalance());

        // Withdraw too much
        System.out.println("\n-- Withdraw too much --");
        atm.withdraw(10000);

        // Transfer
        System.out.println("\n-- Transfer 150 to acc2 --");
        atm.transfer(acc2, 150);

        System.out.println("Account 1 Balance: " + acc1.getBalance());
        System.out.println("Account 2 Balance: " + acc2.getBalance());

        // Eject card
        System.out.println("\n-- Eject Card --");
        atm.ejectCard();

        System.out.println("\n=== END TEST ===");
    }
}
