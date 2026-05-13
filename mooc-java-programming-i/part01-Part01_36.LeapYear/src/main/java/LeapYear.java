import java.util.Scanner;

public class LeapYear {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Give a year: ");
        int year = Integer.valueOf(reader.nextLine());

        // Step 1: If it's not divisible by 4, it is definitely not a leap year.
        if (year % 4 != 0) {
            System.out.println("The year is not a leap year.");
            
        // Step 2: If divisible by 4 but NOT divisible by 100, it is a leap year.
        } else if (year % 100 != 0) {
            System.out.println("The year is a leap year.");
            
        // Step 3: If divisible by 100, it must also be divisible by 400 to be a leap year.
        } else if (year % 400 == 0) {
            System.out.println("The year is a leap year.");
            
        // Step 4: Divisible by 100 but not by 400 means it is not a leap year (e.g., 1800).
        } else {
            System.out.println("The year is not a leap year.");
        }
    }
}