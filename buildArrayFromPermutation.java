import java.util.Scanner;

class Solution {
    public int[] buildArray(int[] nums) {
        int[] ans = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            ans[i] = nums[nums[i]];
        }

        return ans;
    }
}

public class buildArrayFromPermutation {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        System.out.println("Enter array elements (values must be between 0 and " + (n - 1) + "):");

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();

            if (nums[i] < 0 || nums[i] >= n) {
                System.out.println("Invalid input! Each element must be between 0 and " + (n - 1));
                sc.close();
                return;
            }
        }

        Solution sol = new Solution();
        int[] result = sol.buildArray(nums);

        System.out.println("Result array:");

        for (int num : result) {
            System.out.print(num + " ");
        }

        System.out.println();
        sc.close();
    }
}