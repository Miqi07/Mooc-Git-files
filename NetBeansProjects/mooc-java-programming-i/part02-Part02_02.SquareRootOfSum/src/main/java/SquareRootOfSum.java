
import java.util.Scanner;

public class SquareRootOfSum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int no = Integer.valueOf(scanner.nextLine());

        int no1 = Integer.valueOf(scanner.nextLine());
        double sum = no + no1;
        System.out.println(Math.sqrt(sum));
    }
}
