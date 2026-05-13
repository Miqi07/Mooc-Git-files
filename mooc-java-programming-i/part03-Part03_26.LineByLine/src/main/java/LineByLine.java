import java.util.Scanner;

public class LineByLine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String input = scanner.nextLine();

            // Stop reading and halt if the input string is completely empty
            if (input.equals("")) {
                break;
            }

            // Split the input string into pieces wherever there is a space
            String[] pieces = input.split(" ");

            // Loop through the pieces and print each one on its own line
            for (String piece : pieces) {
                System.out.println(piece);
            }
        }
    }
}