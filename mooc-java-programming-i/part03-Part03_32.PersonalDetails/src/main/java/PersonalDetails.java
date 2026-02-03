
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = 0;
        int sum = 0;
        String name = "";
        while (true) {

            String input = scanner.nextLine();

            if (input.isEmpty()) {
                break;
            }

            String[] spllit = input.split(",");
            int birthyrs = Integer.valueOf(spllit[1]);

            if (spllit[0].length() > name.length()) {

                name = spllit[0];

            }

            count++;
            sum += birthyrs;

        }

        System.out.println("Name of the oldest: " + name);
        System.out.println("Average of the birth years: " + 1.0 * sum / count);
    }
}
