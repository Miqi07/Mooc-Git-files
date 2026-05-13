
import java.util.Scanner;

public class NumberAndSumOfNumbers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        // Variables to keep track of count and sum
        int count = 0;
        int sum = 0;

        while (true) {
            System.out.println("Give a number:");
            int number = Integer.valueOf(reader.nextLine());

            // Break the loop immediately if the user inputs 0
            if (number == 0) {
                break;
            }

            // Update trackers for valid numbers
            count = count + 1;
            sum = sum + number;
        }

        // Print final results
        System.out.println("Number of numbers: " + count);
        System.out.println("Sum of the numbers: " + sum);
    }
}