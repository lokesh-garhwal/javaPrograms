import java.util.*;

public class BinaryStrWithoutAdjZeros {

    static class Solution {

        public List<String> validStrings(int n) {
            List<String> list = new ArrayList<>();
            int val = (int) (Math.pow(2, n)) - 1;
            StringBuilder res = new StringBuilder();

            int curr;
            int prev = 1;
            boolean fault = false;

            for (int i = 0; i <= val; i++) {
                curr = i;

                for (int j = 1; j <= n; j++) {
                    if (prev == 0 && (curr % 2) == prev) {
                        fault = true;
                        break;
                    }

                    res.insert(0, curr % 2);
                    prev = curr % 2;
                    curr = curr / 2;
                }

                if (!fault) {
                    list.add(res.toString());
                } else {
                    fault = false;
                }

                prev = 1;
                res.setLength(0);
            }

            return list;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        // Sample input
        int n = 3;

        List<String> result = solution.validStrings(n);

        System.out.println("Valid Strings:");
        System.out.println(result);
    }
}