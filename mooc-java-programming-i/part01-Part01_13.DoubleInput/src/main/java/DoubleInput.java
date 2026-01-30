
import java.util.Scanner;

public class DoubleInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // write your program here
        System.out.println("Give a number:");
        String no1 =scanner.nextLine();
        double no =Double.valueOf(no1);
                System.out.println("You gave the number "+no);

    }
}
