import java.util.*;

public class FindAllDuplicates {

    static class Solution {

        public List<Integer> findDuplicates(int[] nums) {
            int idx = 0;
            List<Integer> list = new ArrayList<>();

            for (int i = 0; i < nums.length; i++) {
                idx = Math.abs(nums[i]) - 1;

                if (nums[idx] <= 0)
                    list.add(Math.abs(nums[i]));
                else
                    nums[idx] = nums[idx] * -1;
            }

            return list;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        // Sample input
        int[] nums = {4, 3, 2, 7, 8, 2, 3, 1};

        List<Integer> result = solution.findDuplicates(nums);

        System.out.println("Duplicate Elements:");
        System.out.println(result);
    }
}