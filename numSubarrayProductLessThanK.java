import java.util.*;

class Solution {

    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int res = 0;
        int product = 1;

        for (int i = 0; i < nums.length; i++) {

            for (int j = i; j < nums.length; j++) {

                if (i == j) {
                    product = nums[i];
                } else {
                    product *= nums[j];
                }

                if (product < k) {
                    res++;
                } else {
                    break;
                }
            }
        }

        return res;
    }
}

public class numSubarrayProductLessThanK {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input array size
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

        // Call method
        int result = sol.numSubarrayProductLessThanK(nums, k);

        // Display result
        System.out.println("Number of subarrays with product less than k: " + result);

        sc.close();
    }
}