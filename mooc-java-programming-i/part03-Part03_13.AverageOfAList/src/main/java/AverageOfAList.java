
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfAList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // implement here a program, that first reads user input
        // adding them on a list until user gives -1.
        // Then it computes the average of the numbers on the list
        // and prints it.
        ArrayList<Integer> list = new ArrayList<>();
        while (true) {
            int nums = Integer.valueOf(scanner.nextLine());
            if (nums == -1) {

                break;
            }
            list.add(nums);
        }
       
        int totalnums = 0;
        int sum = 0;
        for (int num : list) {
            sum += num;
            totalnums = list.size() ;

        }
       
        double average = 1.0 * sum / totalnums;
        System.out.println("Average: " + average);
    }
}
