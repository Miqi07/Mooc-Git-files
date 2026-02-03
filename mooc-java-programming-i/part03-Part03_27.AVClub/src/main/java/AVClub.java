
import java.util.Scanner;

public class AVClub {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {

            String input = scanner.nextLine();
            if (input.isEmpty()) {
                break;
            }

            String[] spllit = input.split(" ");
            for (String pieces : spllit) {
                if (pieces.contains("av")) {
                    System.out.println(pieces);
                }
            }

        }

    }
}
