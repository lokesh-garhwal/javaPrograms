import java.util.*;

public class MaxScore {

    static class Solution {

        public int maxScore(String s) {
            int t0 = 0;
            int t1 = 0;
            int tsum = 0;

            for (int i = 0; i < s.length(); i++) {
                if ((s.charAt(i) - '0') == 0)
                    t0++;
                else
                    t1++;
            }

            tsum = t0 + t1;

            int c0 = 0;
            int c1 = 0;
            int left = 0;
            int right = 0;
            int max = 0;

            for (int i = 0; i < s.length() - 1; i++) {
                if ((s.charAt(i) - '0') == 0)
                    c0++;
                else
                    c1++;

                left = c0;
                right = t1 - c1;

                if ((left + right) > max)
                    max = (left + right);

                if ((left + right) == tsum)
                    break;
            }

            return max;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        // Sample input
        String s = "011101";

        int result = solution.maxScore(s);

        System.out.println("Maximum Score: " + result);
    }
}