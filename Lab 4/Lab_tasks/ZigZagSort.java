import java.util.Arrays;

public class ZigZagSort {
    public static void main(String[] args) {
        int[] nums = {4, 3, 7, 8, 6, 2, 1};
        zigZagSort(nums);
        System.out.println(Arrays.toString(nums));
    }

    public static void zigZagSort(int[] nums) {
        boolean flag = true;
        for (int i = 0; i < nums.length - 1; i++) {
            if (flag) {
                if (nums[i] > nums[i + 1]) {
                    swap(nums, i, i + 1);
                }
            } else {
                if (nums[i] < nums[i + 1]) {
                    swap(nums, i, i + 1);
                }
            }
            flag = !flag;
        }
    }

    private static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
