
public class AdvancedAstrology {

    // Part 1: Printing stars
    public static void printStars(int number) {
        int i = 0;
        while (i < number) {
            System.out.print("*");
            i++;
        }
        System.out.println();
    }

    // Part 1: Printing spaces
    public static void printSpaces(int number) {
        int i = 0;
        while (i < number) {
            System.out.print(" ");
            i++;
        }
    }

    // Part 2: Printing a right-leaning triangle
    public static void printTriangle(int size) {
        int i = 1;
        while (i <= size) {
            printSpaces(size - i);
            printStars(i);
            i++;
        }
    }

    // Part 3: Printing a Christmas tree
    public static void christmasTree(int height) {
        // 1. Print the branches (triangle body)
        int i = 1;
        while (i <= height) {
            int spaces = height - i;
            int stars = (i * 2) - 1;
            printSpaces(spaces);
            printStars(stars);
            i++;
        }

        // 2. Print the tree base (always 2 rows high, 3 stars wide, centered)
        int baseRows = 2;
        int baseSpaces = height - 2;
        int baseStars = 3;

        int j = 0;
        while (j < baseRows) {
            printSpaces(baseSpaces);
            printStars(baseStars);
            j++;
        }
    }

    public static void main(String[] args) {
        // You can run tests inside main to confirm outputs locally
        System.out.println("--- Triangle Test ---");
        printTriangle(4);
        System.out.println("\n--- Christmas Tree Test ---");
        christmasTree(4);
    }
}
