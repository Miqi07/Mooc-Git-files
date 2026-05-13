import java.util.ArrayList;
import java.util.Scanner;

public class IndexOf {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        
        // 1. Read numbers until the user types -1
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == -1) {
                break;
            }
            list.add(input);
        }

        System.out.println("");

        // 2. Ask the user for the number they want to find
        System.out.print("Search for? ");
        int searching = Integer.valueOf(scanner.nextLine());

        // 3. Loop through the list and print matching indices
        int index = 0;
        while (index < list.size()) {
            if (list.get(index) == searching) {
                System.out.println(searching + " is at index " + index);
            }
            index++;
        }
    }
}