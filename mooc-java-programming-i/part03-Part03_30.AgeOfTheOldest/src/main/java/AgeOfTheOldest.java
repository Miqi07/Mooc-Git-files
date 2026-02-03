
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int oldest = 0;

        while (true) {
            String agename = scanner.nextLine();

            if (agename.isEmpty()) {
                break;
            }
            String[] parts = agename.split(",");
            int[] store = new int[parts.length];

            for (int i = 0; i < parts.length; i++) {

                int age = Integer.valueOf(parts[1]);
                store[i] = age;

            }
            int guard = store[0];

            for (int i = 0; i < parts.length; i++) {

                if (guard < store[i]) {
                    guard = store[i];
                    guard += oldest;
                }
            }

        }

        System.out.println("Age of the oldest: " + oldest);
    }

}
