
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GradeRegister register = new GradeRegister();

        System.out.println("Enter point totals, -1 stops:");
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
                if (input == -1) break;
            register.addPoint(input);
        }

        System.out.println("Point average (all): " + register.averageAll());
        System.out.println("Point average (passing): " + register.averagePassing());
        System.out.println("Pass percentage: " + register.passPercentage());
        register.printGradeDistribution();
    }
}