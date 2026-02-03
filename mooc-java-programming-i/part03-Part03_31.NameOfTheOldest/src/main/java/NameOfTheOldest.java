
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int greatest = 0;
        String oldname = "";
        while (true) {

            String input = scanner.nextLine();

            if (input.isEmpty()) {
                break;
            }

            String[] spllit = input.split(",");
            int oldest = Integer.valueOf(spllit[1]);

            if (oldest > greatest) {
                greatest = oldest;
                oldname = spllit[0];
            }
        }
       
        System.out.println("Name of the oldest: " + oldname);
    }
}
