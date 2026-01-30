
import java.util.Scanner;

public class RepeatingBreakingAndRemembering {

    public static void main(String[] args) {

        // This exercise is worth five exercise points, and it is 
        // gradually extended part by part.
        // If you want, you can send this exercise to the server
        // when it's just partially done. In that case the server will complain about 
        // the parts you haven't done, but you'll get points for the finished parts.
        Scanner scanner = new Scanner(System.in);
        //input
        System.out.println("Write numbers:");
        int num = 0;
        int sum = 0;
        int even = 0;
        int odd = 0;
        while (true) {
            int no = Integer.valueOf(scanner.nextInt());

            if (no == -1) {
                System.out.println("Thx!Bye");
                break;
            }
            boolean calc = no % 2 == 0;
            sum = no + sum;
            num++;
            if (calc) {
                even++;
            } else if (!calc) {
                odd++;
            }
        }
        double average;
        average = (double) sum / num;
        System.out.println("Sum: " + sum);
        System.out.println("Numbers: " + num);
        System.out.println("Average:" + average);
        System.out.println("Even: " + even);
        System.out.println("Odd:" + odd);

    }
}
