
import java.util.ArrayList;
import java.util.Scanner;

public class Items {

    public static void main(String[] args) {
        // implement here your program that uses the class Item

        ArrayList<Item> items = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
//Item miqi = new Item("njm");
        while (true) {
            System.out.println("Name:");
            String item = scanner.nextLine();
 
            if (item.isEmpty()) {
                break;
            }

            items.add(new Item(item));
        }

        for (Item ittems : items) {
            System.out.println(ittems);
        }
    }
}
