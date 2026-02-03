
public class Printer {

    public static void main(String[] args) {
        // You can test the method here
        int[] array = {0, 1, 3, 4, 2};
        printArrayInStars(array);
    }

    public static void printArrayInStars(int[] array) {
        // Write some code in here
             
//what item?=length
//what repetitions?=stars
        //print a line of stars for each item
        for (int i = 0; i < array.length; i++) {
            for (int j =0; j < array[i]; j++) {
                System.out.print("*");
            }

            System.out.println("");
        }

    }
}
