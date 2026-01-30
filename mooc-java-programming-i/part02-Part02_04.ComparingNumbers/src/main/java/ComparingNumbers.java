
import java.util.Scanner;

public class ComparingNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int no = Integer.valueOf(scanner.nextLine());
        int num2 = Integer.valueOf(scanner.nextLine());
        if (no > num2) {
            System.out.println(no + " is greater than " + num2);
        } else if (num2 > no) {
            System.out.println(no + " is smaller than " + num2);
        } else {
            System.out.println(no + " is equal to " + num2);
        }

    }
}
