import java.util.*;

class Solution {

    public static void solve(int[] arr,
                             int i,
                             int sum,
                             int target,
                             List<List<Integer>> list,
                             List<Integer> templist) {

        if (sum == target) {
            list.add(new ArrayList<>(templist));
            return;
        }

        if (sum > target || i == arr.length)
            return;

        templist.add(arr[i]);

        solve(arr,
              i,
              sum + arr[i],
              target,
              list,
              templist);

        templist.remove(templist.size() - 1);

        solve(arr,
              i + 1,
              sum,
              target,
              list,
              templist);

        return;
    }

    public List<List<Integer>> combinationSum(
            int[] candidates,
            int target) {

        Arrays.sort(candidates);

        List<List<Integer>> list =
                new ArrayList<>();

        solve(candidates,
              0,
              0,
              target,
              list,
              new ArrayList<>());

        return list;
    }
}

public class combinationSum {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int[] candidates = new int[n];

        System.out.println("Enter array elements:");

        for (int i = 0; i < n; i++) {
            candidates[i] = sc.nextInt();
        }

        System.out.print("Enter target: ");
        int target = sc.nextInt();

        Solution obj = new Solution();

        List<List<Integer>> ans =
                obj.combinationSum(
                        candidates,
                        target);

        System.out.println(
                "Combinations:");

        for (List<Integer> x : ans) {
            System.out.println(x);
        }

        sc.close();
    }
}