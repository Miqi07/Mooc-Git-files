
import java.util.Scanner;

public class OnlyPositives {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Give a number");
            int no = Integer.valueOf(scanner.nextLine());
            if (no == 0) {
                break;
            }
            if (no < 0) {
                System.out.println("Unsuitable number");
               
            } else if (no > 0) {

                System.out.println(no * no);
            }
        }
    }
}
