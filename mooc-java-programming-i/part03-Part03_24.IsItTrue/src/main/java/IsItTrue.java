
import java.util.Scanner;

public class IsItTrue {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        boolean right = Boolean.valueOf(scanner.nextLine());
        
        if (right) {
            System.out.println("You got it right!");
        } else {
            System.out.println("Try again!");
        }
    }
}
