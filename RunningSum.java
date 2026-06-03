import java.util.*;

class Solution {
    public int[] runningSum(int[] nums) {
        int[] res = new int[nums.length];
        int sum = 0;

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            res[i] = sum;
        }

        return res;
    }
}

public class RunningSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input size of array
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        // Input array elements
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        // Create object
        Solution sol = new Solution();

        // Call method
        int[] result = sol.runningSum(nums);

        // Print result
        System.out.println("Running Sum Array:");
        for (int num : result) {
            System.out.print(num + " ");
        }

        sc.close();
    }
}