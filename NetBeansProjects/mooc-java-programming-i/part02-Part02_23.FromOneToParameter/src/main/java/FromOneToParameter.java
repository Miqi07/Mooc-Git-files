
import java.util.Scanner;

public class FromOneToParameter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number.");
        int a = scanner.nextInt();
        printUntilNumber(a);
        int b = 1;
        for (int i = a; i <= b; i++) {
            System.out.println(i);
        }
    }

    public static void printUntilNumber(int number) {

    }
}
