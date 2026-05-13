import java.util.Scanner;

public class CheckingTheAge {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("How old are you? ");
        int age = Integer.valueOf(reader.nextLine());

        // A single if-command validating both upper and lower boundaries
        if (age >= 0 && age <= 120) {
            System.out.println("OK");
        } else {
            System.out.println("Impossible!");
        }
    }
}