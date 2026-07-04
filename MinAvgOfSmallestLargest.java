import java.util.*;

public class MinAvgOfSmallestLargest {

    static class Solution {

        public double minimumAverage(int[] nums) {
            Arrays.sort(nums);

            double res = Integer.MAX_VALUE;
            double val;
            int j;

            for (int i = 0; i < (nums.length / 2); i++) {
                j = nums.length - i - 1;
                val = (nums[i] + nums[j]) / 2.0;

                if (val < res)
                    res = val;
            }

            return res;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        // Sample input
        int[] nums = {7, 8, 3, 4, 15, 13, 4, 1};

        double result = solution.minimumAverage(nums);

        System.out.println("Minimum Average: " + result);
    }
}