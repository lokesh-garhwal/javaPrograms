import java.util.*;

public class IsPalin {

    static class Solution {

        boolean ispalin(String str) {
            int j;

            for (int i = 0; i < str.length(); i++) {
                j = str.length() - 1 - i;

                if (str.charAt(i) != str.charAt(j))
                    return false;
            }

            return true;
        }

        public boolean isStrictlyPalindromic(int n) {
            StringBuilder temp = new StringBuilder();
            int n1 = n;
            boolean res = false;

            for (int i = 2; i <= n - 2; i++) {
                while (n1 > 0) {
                    temp.insert(0, (n1 % i));
                    n1 /= i;
                }

                res = ispalin(temp.toString());

                if (!res)
                    return false;
                else {
                    temp.setLength(0);
                    n1 = n;
                }
            }

            return true;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        // Sample input
        int n = 9;

        boolean result = solution.isStrictlyPalindromic(n);

        System.out.println("Is Strictly Palindromic: " + result);
    }
}