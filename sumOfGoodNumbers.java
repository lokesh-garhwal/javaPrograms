import java.util.*;

class Solution {
    public int sumOfGoodNumbers(int[] nums, int k) {
        int sum = 0;

        for (int i = 0; i < nums.length; i++) {

            if ((i - k) >= 0 && (i + k) < nums.length) {
                if (nums[i] > nums[i - k] && nums[i] > nums[i + k]) {
                    sum += nums[i];
                }
            }

            else if ((i - k) >= 0) {
                if (nums[i] > nums[i - k]) {
                    sum += nums[i];
                }
            }

            else if ((i + k) < nums.length) {
                if (nums[i] > nums[i + k]) {
                    sum += nums[i];
                }
            }
        }

        return sum;
    }
}

public class sumOfGoodNumbers {
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

        // Input k
        System.out.print("Enter value of k: ");
        int k = sc.nextInt();

        // Create object
        Solution sol = new Solution();

        // Call function
        int result = sol.sumOfGoodNumbers(nums, k);

        // Print result
        System.out.println("Sum of good numbers: " + result);

        sc.close();
    }
}