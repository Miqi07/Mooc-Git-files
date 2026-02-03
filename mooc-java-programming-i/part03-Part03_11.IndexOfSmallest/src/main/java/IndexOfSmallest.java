
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOfSmallest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // implement here a program that reads user input
        // until the user enters 9999
        // after that, the program prints the smallest number
        // and its index -- the smallest number
        // might appear multiple times
        ArrayList<Integer> list = new ArrayList<>();

        while (true) {
            int input = Integer.valueOf(scanner.nextLine());

            if (input == 9999) {
                break;
            }

            list.add(input);
        }

        int minimumindex = 0;
        int smallest = list.get(0);
        int i = 1;

        while (i < list.size()) {
            int num = list.get(i);

            if (num < smallest) {
                smallest = num;
                minimumindex = i;

            }
            i++;
        }
        
        System.out.println(" Smallest number: " + smallest );
    }
}
