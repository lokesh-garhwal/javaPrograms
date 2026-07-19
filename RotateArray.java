import java.util.*;

public class RotateArray {

    static class Solution {

        public void rotate(int[] nums, int k) {
            if (k > nums.length) {
                k = (k % nums.length);
            }

            System.out.println(k);
            System.out.println(nums.length);

            int newLength = nums.length - k;
            int[] arr = new int[newLength];

            for (int i = 0; i < newLength; i++) {
                arr[i] = nums[i];
            }

            int index = 0;

            for (int i = newLength; i < nums.length; i++) {
                nums[index++] = nums[i];
            }

            int temp = 0;

            for (int i = index; i < nums.length; i++) {
                nums[i] = arr[temp++];
            }

            return;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        // Sample input
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;

        solution.rotate(nums, k);

        System.out.println("Rotated Array:");
        System.out.println(Arrays.toString(nums));
    }
}