import java.util.*;

public class SmallestEvenMultiple {

    static class Solution {

        public int smallestEvenMultiple(int n) {
            int i = 1;
            int res = 0;

            while (true) {
                if (i % n == 0 && i % 2 == 0) {
                    res = i;
                    break;
                }
                i++;
            }

            return res;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        // Sample input
        int n = 5;

        int result = solution.smallestEvenMultiple(n);

        System.out.println("Smallest Even Multiple: " + result);
    }
}