import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class MergeAndRemoveDuplicates {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4};
        int[] array2 = {3, 4, 5, 6};

        // Combine both arrays into a single array
        int[] combinedArray = new int[array1.length + array2.length];
        System.arraycopy(array1, 0, combinedArray, 0, array1.length);
        System.arraycopy(array2, 0, combinedArray, array1.length, array2.length);

        // Remove duplicates using a HashSet
        Set<Integer> uniqueNumbers = new HashSet<>();
        for (int num : combinedArray) {
            uniqueNumbers.add(num);
        }

        // Convert the HashSet back to an array
        int[] mergedArrayWithoutDuplicates = new int[uniqueNumbers.size()];
        int i = 0;
        for (int num : uniqueNumbers) {
            mergedArrayWithoutDuplicates[i++] = num;
        }

        System.out.println("Merged array without duplicates: " + Arrays.toString(mergedArrayWithoutDuplicates));
    }
}
