import java.util.Arrays;

public class ArraySwap {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4};
        int[] array2 = {5, 6, 7, 8};

        System.out.println("Before swapping:");
        System.out.println("Array 1: " + Arrays.toString(array1));
        System.out.println("Array 2: " + Arrays.toString(array2));

        // Swap the elements using a temporary array
        int[] temp = array1.clone();
        array1 = array2.clone();
        array2 = temp.clone();

        System.out.println("\nAfter swapping:");
        System.out.println("Array 1: " + Arrays.toString(array1));
        System.out.println("Array 2: " + Arrays.toString(array2));
    }
}
