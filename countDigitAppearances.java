import java.util.*;

class Solution {
    public int countDigitOccurrences(int[] nums, int digit) {
        int count = 0;

        for (int i = 0; i < nums.length; i++) {

            while (nums[i] > 0) {
                if ((nums[i] % 10) == digit)
                    count++;

                nums[i] /= 10;
            }
        }

        return count;
    }
}

public class countDigitAppearances {
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

        // Input digit
        System.out.print("Enter digit to count: ");
        int digit = sc.nextInt();

        // Create object
        Solution sol = new Solution();

        // Call method
        int result = sol.countDigitOccurrences(nums, digit);

        // Display result
        System.out.println("Occurrences of digit " + digit + ": " + result);

        sc.close();
    }
}