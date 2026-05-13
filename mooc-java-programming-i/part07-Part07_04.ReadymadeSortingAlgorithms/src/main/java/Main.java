import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        // You can use the main method to test your implementations
    }

    // Sorts a primitive array of integers in-place
    public static void sort(int[] array) {
        Arrays.sort(array);
    }

    // Sorts an array of Strings in-place (lexicographically)
    public static void sort(String[] array) {
        Arrays.sort(array);
    }

    // Sorts an ArrayList of Integers in-place
    public static void sortIntegers(ArrayList<Integer> integers) {
        Collections.sort(integers);
    }

    // Sorts an ArrayList of Strings in-place (lexicographically)
    public static void sortStrings(ArrayList<String> strings) {
        Collections.sort(strings);
    }
}