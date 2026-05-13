import java.util.Scanner;

public class mainProgram {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        BirdDatabase db = new BirdDatabase(); // Your logic class

        while (true) {
            System.out.print("? ");
            String command = scan.nextLine();

            if (command.equals("Quit")) {
                break;
            } else if (command.equals("Add")) {
                System.out.print("Name: ");
                String name = scan.nextLine();
                System.out.print("Name in Latin: ");
                String latin = scan.nextLine();
                db.add(name, latin);
            } else if (command.equals("Observation")) {
                System.out.print("Bird? ");
                String name = scan.nextLine();
                db.observation(name);
            } else if (command.equals("All")) {
                db.printAll();
            } else if (command.equals("One")) {
                System.out.print("Bird? ");
                String name = scan.nextLine();
                db.printOne(name);
            } else {
                System.out.println("Unknown command!");
            }
        }
    }
}