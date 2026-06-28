import java.util.*;

public class MinValToGetPositive {

    static class Solution {
        public int minStartValue(int[] nums) {
            int startValue = 1;
            boolean flag = true;
            int min = 100;
            int st = startValue;

            while (flag) {
                st = startValue;
                min = 100;

                for (int i = 0; i < nums.length; i++) {
                    if ((st + nums[i]) < 1)
                        break;

                    st += nums[i];
                    System.out.println(st);

                    if (st < min)
                        min = st;

                    if (i == (nums.length - 1))
                        flag = false;
                }

                if (!flag)
                    break;

                startValue++;
            }

            return startValue;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        // Sample input
        int[] nums = {-3, 2, -3, 4, 2};

        int result = solution.minStartValue(nums);

        System.out.println("Minimum Start Value: " + result);
    }
}