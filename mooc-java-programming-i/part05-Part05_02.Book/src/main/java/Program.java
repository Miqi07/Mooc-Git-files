
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        // This is simply an empty main method where you are
        // free to experiment with your Book class.
        // An example that you can use for testing:

//        Book b = new Book("J. K. Rowling", "Harry Potter and the Sorcerer's Stone", 223);
//        System.out.println(b);
        Scanner scan = new Scanner(System.in);

        System.out.println("First number");
        int number = scan.nextInt();

        System.out.println("Second number");
        int numberby = scan.nextInt();

        System.out.println("Multiply");
        int multiply = number * numberby;
        System.out.println("Your answer " + multiply);

        System.out.println("Continue");
        String Continue = scan.nextLine();

        while (Continue.equalsIgnoreCase("Continue")  {

            System.out.println("First number");
            int number1 = scan.nextInt();

            System.out.println("Second number");
            int numberby1 = scan.nextInt();

            System.out.println("Multiply");
            int multiply1 = number1 * numberby1;
            System.out.println("Your answer " + multiply1);

        }
    }
}
