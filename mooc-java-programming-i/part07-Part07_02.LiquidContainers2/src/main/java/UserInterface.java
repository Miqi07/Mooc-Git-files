
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author DELL
 */
public class UserInterface {

    private Container container1;
    private Container container2;
    private Scanner scan;

    public UserInterface(Scanner scan, Container container1, Container container2) {
        this.scan = new Scanner(System.in);
        this.container1 = container1;
        this.container2 = container2;

    }

    public void start() {
        while (true) {
            System.out.println("First: " + container1 );
            System.out.println("Second: " + container2 );

            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }
            String[] parts = input.split(" ");
            String command = parts[0];
            int litres = Integer.valueOf(parts[1]);

            switch (command) {
                case "add":
                    container1.add(litres);

                    break;

                case "move":
                    if (litres > 0) {

                        if (litres > container1.contains()) {
                            litres = container1.contains();
                        }

                        container2.add(litres);
                        container1.remove(litres);

                        break;
                    }
                    break;

                case "remove":
                    this.container2.remove(litres);
                   
                    break;
                default:
                    break;
            }

        }
    }
}
