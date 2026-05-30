import java.util.*;

class Solution {

    public static void solve(int[] arr, int i,
                             List<List<Integer>> list,
                             List<Integer> templist) {

        if (i == arr.length) {
            list.add(new ArrayList<>(templist));
            return;
        }

        // Include current element
        templist.add(arr[i]);
        solve(arr, i + 1, list, templist);

        // Backtrack
        templist.remove(templist.size() - 1);

        // Exclude current element
        solve(arr, i + 1, list, templist);
    }

    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();

        solve(nums, 0, list, new ArrayList<>());

        return list;
    }
}

public class subsets {
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
        List<List<Integer>> result = sol.subsets(nums);

        // Display all subsets
        System.out.println("Subsets:");

        for (List<Integer> subset : result) {
            System.out.println(subset);
        }

        sc.close();
    }
}