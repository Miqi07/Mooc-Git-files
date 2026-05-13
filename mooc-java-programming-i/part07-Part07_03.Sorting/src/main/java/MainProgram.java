
import java.util.Arrays;

public class MainProgram {

    public static void main(String[] args) {
        // write your test code here
        int[] array = {3, 1, 5, 99, 3, 12};

        int[] numbers = {8, 3, 7, 9, 1, 2, 4};
        MainProgram.sort(numbers);

    }

    public static int smallest(int[] array) {
        int smallest = array[0];
        for (int store : array) {
            if (store < smallest) {
                smallest = store;
            }
        }
        return smallest;
    }

    public static int indexOfSmallest(int[] array) {
        int index = 0; // Assume the first element is the smallest

        for (int i = 1; i < array.length; i++) {
            if (array[i] < array[index]) {
                index = i; // ...update the index to the new smallest position
            }
        }

        return index;
    }

    public static int indexOfSmallestFrom(int[] array, int startIndex) {
        int index = startIndex; // Assume the first element is the smallest

        for (int i = startIndex + 1; i < array.length; i++) {
            if (array[i] < array[index]) {
                index = i; // ...update the index to the new smallest position
            }
        }

        return index;
    }

    public static void swap(int[] array, int index1, int index2) {

        int store = array[index1];
        array[index1] = array[index2];
        array[index2] = store;

    }

    public static void sort(int[] array) {
        System.out.println(Arrays.toString(array));

        for (int j = 0; j < array.length - 1; j++) {

            int index = j;

            for (int i = j + 1; i < array.length; i++) {

                if (array[i] < array[index]) {
                    index = i;
                }
            }

            if (index != j) {
                MainProgram.swap(array, index, j);
            }
            System.out.println(Arrays.toString(array));
        }
    }

}
