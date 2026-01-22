
import java.util.Scanner;

public class IntegerInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // write your program here
        System.out.println("Give a number:");
        String num = scanner.nextLine();
       int no =Integer.valueOf(num);
      
        System.out.println("You gave the number "+ num);
    }
}
