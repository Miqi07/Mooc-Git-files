
import java.nio.file.Paths;
import java.util.Scanner;

public class RecordsFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Name of the file:");
        String file = scanner.nextLine();

        try (Scanner scan = new Scanner(Paths.get(file));) {
            while (scan.hasNextLine()) {

                String text = scan.nextLine();
                String[] splittedText = text.split(",");

                int age = Integer.parseInt(splittedText[1]);

                if (age > 1) {
                    System.out.println(splittedText[0] + ", age:" + age + " years");
                } else {
                    System.out.println(splittedText[0] + ", age:" + age + " year");
                }
            }

        } catch (Exception error) {
            System.out.println(error);
        };

    }
}
