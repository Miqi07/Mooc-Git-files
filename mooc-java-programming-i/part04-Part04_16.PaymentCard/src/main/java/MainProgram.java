
public class MainProgram {

    public static void main(String[] args) {
        // 1. Create Paul's card with 20 euros and Matt's card with 30 euros
        PaymentCard paulsCard = new PaymentCard(20);
        PaymentCard mattsCard = new PaymentCard(30);

        // 2. Paul eats heartily, Matt eats affordably
        paulsCard.eatHeartily();
        mattsCard.eatAffordably();

        // 3. Print card statuses
        System.out.println("Paul: " + paulsCard);
        System.out.println("Matt: " + mattsCard);

        // 4. Paul tops up 20 euros, Matt eats heartily
        paulsCard.addMoney(20);
        mattsCard.eatHeartily();

        // 5. Print card statuses
        System.out.println("Paul: " + paulsCard);
        System.out.println("Matt: " + mattsCard);

        // 6. Paul eats affordably twice, Matt tops up 50 euros
        paulsCard.eatAffordably();
        paulsCard.eatAffordably();
        mattsCard.addMoney(50);

        // 7. Print card statuses one final time
        System.out.println("Paul: " + paulsCard);
        System.out.println("Matt: " + mattsCard);
    }
}
