import java.util.*;

public class OriginalArrayOfPrefixXOR {

    static class Solution {

        public int[] findArray(int[] pref) {
            int[] res = new int[pref.length];
            res[0] = pref[0];

            for (int i = 0; i < res.length - 1; i++) {
                res[i + 1] = pref[i] ^ pref[i + 1];
            }

            return res;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        // Sample input
        int[] pref = {5, 2, 0, 3, 1};

        int[] result = solution.findArray(pref);

        System.out.println("Result Array:");
        System.out.println(Arrays.toString(result));
    }
}