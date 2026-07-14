import java.util.*;

public class NextPermutation {

    static class Solution {

        public void nextPermutation(int[] nums) {
            if (nums.length == 1)
                return;

            int n1 = 0;

            for (int i = nums.length - 2; i >= 0; i--) {
                if (nums[i] < nums[i + 1]) {
                    n1 = i;
                    break;
                }
            }

            TreeMap<Integer, Integer> map = new TreeMap<>();
            int min = n1 + 1;

            for (int i = min; i < nums.length; i++) {
                if (nums[i] < nums[min])
                    min = i;
                map.put(nums[i], i);
            }

            if (nums[min] <= nums[n1]) {
                for (Map.Entry<Integer, Integer> e : map.entrySet()) {
                    if (e.getKey() > nums[n1]) {
                        min = e.getValue();
                        break;
                    }
                }
            }

            // System.out.println(nums[min]);
            // System.out.println(nums[n1]);

            int temp = nums[n1];
            nums[n1] = nums[min];
            nums[min] = temp;

            Arrays.sort(nums, n1 + 1, nums.length);

            return;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        // Sample input
        int[] nums = {1, 2, 3};

        System.out.println("Original Array:");
        System.out.println(Arrays.toString(nums));

        solution.nextPermutation(nums);

        System.out.println("Next Permutation:");
        System.out.println(Arrays.toString(nums));
    }
}