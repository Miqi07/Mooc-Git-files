
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int no;
        //if they input zero it breaks
        int count = 0;
        int count2 = 0;
        while (true) {
            System.out.println("Give a number:");
            no = Integer.valueOf(scanner.nextLine());
            if (no != 0) {
                count = no + count;
                count2++;
            } else if (no == 0) {
                break;
            }

        }
        double average = 1.0 * count / count2;
        System.out.println("Average of the numbers: " + average);

    }
}
