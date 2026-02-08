
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Book> bookdata = new ArrayList<>();
        // implement here the program that allows the user to enter 
        // book information and to examine them
        while (true) {

            System.out.print("Title:");
            String title = scanner.nextLine();

            if (title.isEmpty()) {
                break;
            }

            System.out.println("Pages:");
            int pages = Integer.valueOf(scanner.nextLine());

            System.out.println("Publication year:");
            int Publicationyear = Integer.valueOf(scanner.nextLine());

            bookdata.add(new Book(title, pages, Publicationyear));

        }

        System.out.println("What information will be printed? ");
        String printed = scanner.nextLine();

        for (Book store : bookdata) {

            if (printed.equals("everything")) {
                System.out.println(store);

            } else if (printed.equals("name")) {
                System.out.println(store.getTitle());

            }
        }

    }
}
