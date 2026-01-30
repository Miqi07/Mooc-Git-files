
import java.util.Scanner;

public class InAHoleInTheGround {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int count = 0;
        System.out.println("How many times.");
        int a = scan.nextInt();
        while (true) {

            if (a != count) {
                printText();
                count++;
            }

        }

    }

    public static void printText() {
        System.out.println("In a hole in the ground there lived a method");
    }

    // Write some code in here
}
