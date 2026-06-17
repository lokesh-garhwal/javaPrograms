import java.util.*;

class Solution {
    public int[] singleNumber(int[] nums) {
        Arrays.sort(nums);

        int[] res = new int[2];
        int index = 0;

        for (int i = 0; i < nums.length; i++) {

            if (i == nums.length - 1 || nums[i] != nums[i + 1]) {
                res[index++] = nums[i];

                if (index == 2)
                    break;
            } 
            else {
                i++;
            }
        }

        return res;
    }
}

public class singleNumIII {
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

        // Create object
        Solution sol = new Solution();

        // Call method
        int[] result = sol.singleNumber(nums);

        // Display result
        System.out.println("Two single numbers are:");
        for (int num : result) {
            System.out.print(num + " ");
        }

        sc.close();
    }
}