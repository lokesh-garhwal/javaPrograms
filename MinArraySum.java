import java.util.*;

public class MinArraySum {

    static class Solution {

        public long minArraySum(int[] nums) {
            long res = 0;
            int[] rs = new int[nums.length];

            for (int i = 0; i < nums.length; i++) {
                rs[i] = nums[i];
            }

            Arrays.sort(rs);

            for (int i = 0; i < nums.length; i++) {
                for (int j = 0; j < rs.length; j++) {
                    if (nums[i] % rs[j] == 0) {
                        nums[i] = rs[j];
                        break;
                    }

                    if ((rs[j] * 2) > nums[i])
                        break;
                }

                res += nums[i];
            }

            return res;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        // Sample input
        int[] nums = {8, 12, 6, 9, 18};

        long result = solution.minArraySum(nums);

        System.out.println("Minimum Array Sum: " + result);
    }
}