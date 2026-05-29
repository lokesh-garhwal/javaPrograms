import java.util.*;

class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length <= 2)
            return nums.length;

        int curr = 1;
        int j = 0;

        for (int i = 1; i < nums.length; i++) {

            if (nums[i] == nums[j]) {
                if (curr < 2) {
                    curr++;

                    if ((j + 1) != i) {
                        j++;
                        nums[j] = nums[i];
                    } else {
                        j++;
                    }
                }
            }

            else if ((j + 1) != i) {
                j++;
                nums[j] = nums[i];
                curr = 1;
            }

            else {
                j++;
                curr = 1;
            }
        }

        return j + 1;
    }
}

public class removeDuplicatesII {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input array size
        System.out.print("Enter size of sorted array: ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        // Input array elements
        System.out.println("Enter sorted array elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        // Create object
        Solution sol = new Solution();

        // Call method
        int newLength = sol.removeDuplicates(nums);

        // Display result
        System.out.println("Length after removing extra duplicates: " + newLength);

        System.out.print("Modified array: ");
        for (int i = 0; i < newLength; i++) {
            System.out.print(nums[i] + " ");
        }

        sc.close();
    }
}