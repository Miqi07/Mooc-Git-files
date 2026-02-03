
import java.util.Scanner;

public class LineByLine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        System.out.println("I will tell you a story, but I need some information first.\n"
                + "What is the main character called?");
        String chara = scanner.nextLine();
        System.out.println("What is their job?");
        String Job = scanner.nextLine();

        System.out.println("Here is the story:\n"
                + "Once upon a time there was " + chara + "," + " who was " + Job + ".\n"
                + "On the way to work, " + chara + " reflected on life.\n"
                + "Perhaps " + chara + " will not be " + Job + " forever.");

    }
}
