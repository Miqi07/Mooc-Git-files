
public class PaymentTerminal {

    private double money;  // amount of cash
    private int affordableMeals; // number of sold affordable meals
    private int heartyMeals;  // number of sold hearty meals

    public PaymentTerminal() {
        // register initially has 1000 euros of money
        this.money = 1000;
    }

    public double eatAffordably(double payment) {
        // an affordable meal costs 2.50 euros
        // increase the amount of cash by the price of an affordable mean and return the change
        // if the payment parameter is not large enough, no meal is sold and the method should return the whole payment
        double affordableMeal = 2.50;
        if (payment >= affordableMeal) {

            double change = payment - affordableMeal;
            this.money += affordableMeal;
            this.affordableMeals = this.affordableMeals + 1;
            return change;

        } else {
            return payment;
        }
    }

    public double eatHeartily(double payment) {
        // a hearty meal costs 4.30 euros
        // increase the amount of cash by the price of a hearty mean and return the change
        // if the payment parameter is not large enough, no meal is sold and the method should return the whole payment

        double heartlyMeal = 4.30;
        if (payment >= heartlyMeal) {

            double change = payment - heartlyMeal;
            this.money += heartlyMeal;
            this.heartyMeals = this.heartyMeals + 1;
            return change;

        } else {
            return payment;
        }
    }

    public boolean eatAffordably(PaymentCard card) {
        // an affordable meal costs 2.50 euros
        // increase the amount of cash by the price of an affordable mean and return the change
        // if the payment parameter is not large enough, no meal is sold and the method should return the whole payment
        double AffordableMeal = 2.50;
        if (card.balance() >= AffordableMeal) {

            card.takeMoney(AffordableMeal);
            this.affordableMeals = this.affordableMeals + 1;
            return true;

        } else {
            return false;
        }
    }

    public boolean eatHeartily(PaymentCard card) {
        // a hearty meal costs 4.30 euros
        // increase the amount of cash by the price of a hearty mean and return the change
        // if the payment parameter is not large enough, no meal is sold and the method should return the whole payment

        double heartlyMeal = 4.30;
        if (card.balance() >= heartlyMeal) {

            card.takeMoney(heartlyMeal);
            this.heartyMeals = this.heartyMeals + 1;

            return true;

        } else {
            return false;
        }

    }

    public void addMoneyToCard(PaymentCard card, double sum) {
        // ...
        if (sum > 0) {
            this.money += sum;
            card.addMoney(sum);
        }
    }

    @Override
    public String toString() {
        return "money: " + money + ", number of sold affordable meals: " + affordableMeals + ", number of sold hearty meals: " + heartyMeals;
    }
}
