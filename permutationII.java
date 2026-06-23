import java.util.*;

class Solution {

    public static void solve(int[] arr, int i,
                             List<List<Integer>> list,
                             List<Integer> templist,
                             boolean[] used) {

        if (templist.size() == arr.length) {
            if (!(list.contains(templist)))
                list.add(new ArrayList<>(templist));
            return;
        }

        for (i = 0; i < arr.length; i++) {

            if (used[i])
                continue;

            used[i] = true;
            templist.add(arr[i]);

            solve(arr, i + 1, list, templist, used);

            templist.remove(templist.size() - 1);
            used[i] = false;
        }
    }

    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();

        solve(nums, 0, list,
              new ArrayList<>(),
              new boolean[nums.length]);

        return list;
    }
}

public class permutationII {
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
        List<List<Integer>> result = sol.permuteUnique(nums);

        // Display permutations
        System.out.println("Unique permutations:");

        for (List<Integer> perm : result) {
            System.out.println(perm);
        }

        sc.close();
    }
}