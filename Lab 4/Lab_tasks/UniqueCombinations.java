import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UniqueCombinations {
    public static void main(String[] args) {
        int[] nums = {10, 1, 2, 7, 6, 1, 5};
        int target = 8;
        List<List<Integer>> combinations = combinationSum2(nums, target);
        System.out.println(combinations);
    }

    public static List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> result = new ArrayList<>();
        backtrack(result, new ArrayList<>(), candidates, target, 0);
        return result;
    }

    private static void backtrack(List<List<Integer>> result, List<Integer> tempList, int[] nums, int remaining, int start) {
        if (remaining == 0) {
            result.add(new ArrayList<>(tempList));
        } else {
            for (int i = start; i < nums.length && nums[i] <= remaining; i++) {
                tempList.add(nums[i]);
                backtrack(result, tempList, nums, remaining - nums[i], i + 1);
                tempList.remove(tempList.size() - 1);
            }
        }
    }
}
