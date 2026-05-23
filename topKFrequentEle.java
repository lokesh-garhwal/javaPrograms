import java.util.*;

class data {
    int val;
    int freq;

    data() {}

    data(int val, int freq) {
        this.val = val;
        this.freq = freq;
    }
}

class Solution {

    public int[] topKFrequent(int[] nums, int k) {

        Arrays.sort(nums);

        ArrayList<data> list = new ArrayList<>();

        int[] res = new int[k];

        int st = 0;

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] != nums[st]) {

                list.add(new data(nums[st], i - st));

                st = i;
            }
        }

        list.add(new data(nums[st], nums.length - st));

        Collections.sort(list, ((a, b) -> b.freq - a.freq));

        st = 0;

        for (data i : list) {

            System.out.println(
                "Value = " + i.val +
                " Frequency = " + i.freq
            );

            if (st == k)
                return res;

            res[st++] = i.val;
        }

        return res;
    }
}

public class topKFrequentEle {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        System.out.println("Enter elements:");

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        System.out.print("Enter k: ");
        int k = sc.nextInt();

        Solution obj = new Solution();

        int[] ans = obj.topKFrequent(nums, k);

        System.out.println("Top K Frequent Elements:");

        for (int x : ans) {
            System.out.print(x + " ");
        }

        sc.close();
    }
}