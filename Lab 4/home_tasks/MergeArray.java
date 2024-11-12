public class MergeArray {
    public int[] mergeArrays(int[] array1, int[] array2) {
        int[] mergedArray = new int[array1.length + array2.length];
        int i = 0, j = 0, k = 0;

        // Merge the elements from both arrays
        while (i < array1.length && j < array2.length) {
            mergedArray[k++] = array1[i++] < array2[j] ? array1[i++] : array2[j++];
        }

        // Copy remaining elements from array1, if any
        while (i < array1.length) {
            mergedArray[k++] = array1[i++];
        }

        // Copy remaining elements from array2, if any
        while (j < array2.length) {
            mergedArray[k++] = array2[j++];
        }

        return mergedArray;
    }

    public static void main(String[] args) {
        MergeArray merger = new MergeArray();
        int[] array1 = {1, 3, 5, 7};
        int[] array2 = {2, 4, 6, 8};

        int[] mergedArray = merger.mergeArrays(array1, array2);
        System.out.println("Merged array: " + Arrays.toString(mergedArray));
    }
}
