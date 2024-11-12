import java.util.ArrayList;

public class KthSmallestElement {
    public static int findKthSmallest(ArrayList<Integer> arr, int k) {
        if (k < 1 || k > arr.size()) {
            return -1; // Invalid k
        }
        return arr.get(k - 1);
    }

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(2);
        arr.add(4);
        arr.add(6);
        arr.add(8);
        arr.add(10);

        int k = 3;
        int kthSmallest = findKthSmallest(arr, k);

        if (kthSmallest != -1) {
            System.out.println("The " + k + "-th smallest element is: " + kthSmallest);
        } else {
            System.out.println("Invalid k value");
        }
    }
}