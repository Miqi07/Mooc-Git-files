
import java.util.Scanner;

public class Cubes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long count = 1;
        while (true) {

            String input = scanner.nextLine();
            if (input.equals("end")) {
                break;
            }

            int change = Integer.parseInt(input);
            System.out.println(change * change * change);

        }

    }
}
