
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.ArrayList;

public class IsItInTheFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();

        System.out.println("Name of the file:");
        String file = scanner.nextLine();

        System.out.println("Search for:");
        String searchedFor = scanner.nextLine();

        try (Scanner scan = new Scanner(Paths.get(file))) {
            boolean found = false;

            while (scan.hasNextLine()) {
                if (scan.nextLine().equals(searchedFor)) {

                    found = true;
                    break;
                }
            }

            if (found) {
                System.out.println("Found");

            } else {
                System.out.println("Not found");
            }

        } catch (Exception e) {
            System.out.println("Reading the file" + e.getMessage() + "failed");
        }
    }
}
