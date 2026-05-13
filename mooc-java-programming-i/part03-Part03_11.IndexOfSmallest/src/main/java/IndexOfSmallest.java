import java.util.ArrayList;
import java.util.Scanner;

public class IndexOfSmallest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();

        // Loop 1: Read inputs until 9999 is entered
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == 9999) {
                break;
            }
            list.add(input);
        }

        System.out.println("");

        // Part 2: Find the smallest number value in the list
        int smallest = list.get(0);
        int i = 0;
        while (i < list.size()) {
            int number = list.get(i);
            if (number < smallest) {
                smallest = number;
            }
            i++;
        }
        
        System.out.println("Smallest number: " + smallest);

        // Loop 3: Find and print all indices where that smallest value is located
        int index = 0;
        while (index < list.size()) {
            if (list.get(index) == smallest) {
                System.out.println("Found at index: " + index);
            }
            index++;
        }
    }
}