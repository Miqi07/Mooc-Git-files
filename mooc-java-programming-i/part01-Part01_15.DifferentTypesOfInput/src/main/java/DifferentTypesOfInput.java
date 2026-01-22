
import java.util.Scanner;

public class DifferentTypesOfInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        System.out.println("Give a string:");
        String string =scanner.nextLine();
        
        System.out.println("Give an integer:");
        int i = Integer.valueOf(scanner.nextLine());
        
        System.out.println("Give a double:");
        double doub =Double.valueOf(scanner.nextLine());
        
        System.out.println("Give a boolean:");
        boolean santa = Boolean.valueOf(scanner.nextLine());
        
        System.out.println("You gave the string "+ string +"\n"+
      "You gave the integer " + i +"\n"+
        "You gave the double "+ doub + "\n"+
                " You gave the boolean "+santa);
        
        
        

    }
}
