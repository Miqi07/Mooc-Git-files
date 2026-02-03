
import java.util.Scanner;

public class LineByLine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        String[] split = text.split(" ");

        for (String times : split) {
            System.out.println(times);
        }

    }
}
