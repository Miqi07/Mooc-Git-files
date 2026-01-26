
public class AdvancedAstrology {

    public static void printStars(int number) {
        // part 1 of the exercise
        for (int i = 1; i <= number; i++) {
            System.out.print("*");
        }
        System.out.println("");
    }

    public static void printSpaces(int number) {
        for (int i = 1; i <= number; i++) {
            System.out.print(" ");
        }
        // part 1 of the exercise
    }

    public static void printTriangle(int size) {
        // part 2 of the exercise
        int i = 1;
        while (i<=size) {
            printSpaces(size - i);
            printStars(size);
            i++;
        }
    }

    public static void christmasTree(int height) {
        // part 3 of the exercise
        int i = 0;
        while (height>= i) {
            printStars(height - (height - i));
            printSpaces(height-i);
            i++;
        }

        for (int j =0; j <= 2; j++) {
            printSpaces(height-3);
            printStars(3);
        }
       

    }

    public static void main(String[] args) {
        // The tests are not checking the main, so you can modify it freely.

        printTriangle(5);
        System.out.println("---");
        christmasTree(4);
        System.out.println("---");
        christmasTree(10);
    }
}
