
import java.util.Scanner;

public class SimpleCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here

        System.out.println("Give the first number:");
       int num1 =Integer.valueOf(scanner.nextLine());
        System.out.println("Give the second number:");
int num2 =Integer.valueOf(scanner.nextLine());
int sub=num1-num2;
int add=num1+num2 ;
int multiply =num1*num2 ;
double div =1.0*num1/num2;
        System.out.println(num1+" + "+ num2 +" = "+add );
         System.out.println(num1+" - "+ num2 +" = "+ sub );
         System.out.println(num1+" * "+ num2 +" = "+ multiply  );
         System.out.println(num1+" / "+ num2 +" = "+ div );
        /*
        8 + 2 = 10
8 - 2 = 6
8 * 2 = 16
8 / 2 = 4.0*/
    }
}
