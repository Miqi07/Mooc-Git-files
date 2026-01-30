
import java.util.Scanner;

public class GiftTax {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        /*
        
        For example 6000€ gift implies 180€ of gift tax (100 +
        (6000-5000) * 0.08), and 75000€ gift implies 7100€ of gift tax (4700 + (75000-55000) * 0.12).
        
        5 000 — 25 000	    100	  8
25 000 — 55 000	1 700	          10
55 000 — 200 000	4 700	  12
200 000 — 1 000 000	22 100	   15
1 000 000 —	142 100	17
         */
        System.out.println("Value of the gift?");
        int value = Integer.valueOf(scan.nextLine());

        double valued1;
        valued1 = 100 + (value - 5000) * 0.08;

        double valued2;
        valued2 = 1700 + (value - 25000) * 0.1;

        double valued3;
        valued3 = 4700 + (value - 55000) * 0.12;

        double valued4;
        valued4 = 22100 + (value - 200_000) * 0.15;

        double valued5;
        valued5 = 142100 + (value - 1000_000) * 0.17;

        if (value < 5000) {
            System.out.println("No tax!");
        } else if (value >= 5000 && value < 25000) {
            System.out.println("Tax: " + valued1);
        } else if (value > 25000 && value < 55000) {
            System.out.println("Tax: " + valued2);
        } else if (value >= 55000 && value < 200000) {
            System.out.println("Tax : " + valued3);
        } else if (value > 200000 && value < 1000000) {
            System.out.println("Tax: " + valued4);
        } else {
            System.out.println("Tax: " + valued5);

        }
    }

}
