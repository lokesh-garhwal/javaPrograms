import java.util.*;

public class GetMinDistance {

    static class Solution {

        public int getMinDistance(int[] nums, int target, int start) {
            int res = 0;
            int min = Integer.MAX_VALUE;

            for (int i = 0; i < nums.length; i++) {
                if (nums[i] == target) {
                    res = Math.abs(i - start);
                    if (res < min)
                        min = res;
                }
            }

            return min;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        // Sample input
        int[] nums = {1, 2, 3, 4, 5};
        int target = 5;
        int start = 3;

        int result = solution.getMinDistance(nums, target, start);

        System.out.println("Minimum Distance: " + result);
    }
}