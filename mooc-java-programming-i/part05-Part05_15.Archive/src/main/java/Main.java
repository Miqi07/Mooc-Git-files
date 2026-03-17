
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Equals> list = new ArrayList();
        while (true) {

            System.out.println("Identifier? (empty will stop)");
            String identifier = scanner.nextLine();

            if (identifier.isEmpty()) {
                break;
            }
            System.out.println("Name? (empty will stop)");
            String name = scanner.nextLine();

            if (name.isEmpty()) {
                break;
            }
            Equals item = new Equals(identifier, name);
            if (!list.contains(item)) {
                list.add(item);
            }

        }
        for (Equals store : list) {
            System.out.println(store);
        }

    }
}
