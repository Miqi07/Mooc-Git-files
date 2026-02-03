
import java.util.Scanner;

public class SumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int no;
        //if they input zero it breaks
        int count = 0;
        while (true) {
            System.out.println("Give a number:");
            no = Integer.valueOf(scanner.nextLine());
            if (no != 0) {
                count = no + count;

            } else if (no == 0) {
                break;
            }

        }
        System.out.println("Sum of the numbers: " + count);

    }
}
