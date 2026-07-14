import java.util.*;

public class ConcatWithReverse {

    static class Solution {

        public int[] concatWithReverse(int[] nums) {
            int[] res = new int[2 * nums.length];

            for (int i = 0; i < nums.length; i++) {
                res[i] = nums[i];
            }

            int idx = nums.length;

            for (int i = nums.length - 1; i >= 0; i--) {
                res[idx++] = nums[i];
            }

            return res;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        // Sample input
        int[] nums = {1, 2, 3, 4};

        int[] result = solution.concatWithReverse(nums);

        System.out.println("Concatenated Array:");
        System.out.println(Arrays.toString(result));
    }
}