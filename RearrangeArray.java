import java.util.*;

public class RearrangeArray {
    static class Solution {

        public int[] rearrangeArray(int[] nums) {
            int[] pos = new int[nums.length / 2];
            int[] neg = new int[nums.length / 2];

            int ind = 0;
            int idx = 0;

            for (int i = 0; i < nums.length; i++) {
                if (nums[i] > 0) {
                    pos[idx++] = nums[i];
                } else {
                    neg[ind++] = nums[i];
                }
            }

            ind = 0;
            idx = 0;
            boolean positive = true;

            for (int i = 0; i < nums.length; i++) {
                if (positive) {
                    nums[i] = pos[idx++];
                    positive = false;
                } else {
                    nums[i] = neg[ind++];
                    positive = true;
                }
            }

            return nums;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        // Sample input
        int[] nums = {3, 1, -2, -5, 2, -4};

        int[] result = solution.rearrangeArray(nums);

        System.out.println("Rearranged Array:");
        System.out.println(Arrays.toString(result));
    }
}