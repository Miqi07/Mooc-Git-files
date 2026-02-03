
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int oldest = 0;

        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }

            String[] parts = input.split(",");
            // We know the age is ALWAYS at index 1 in this fixed format
            int age = Integer.valueOf(parts[1]);

            // Comparison logic: Only update if the new age is bigger
            if (age > oldest) {
                oldest = age;
            }
        }
     System.out.println("Age of the oldest: " + oldest);
    }
}
