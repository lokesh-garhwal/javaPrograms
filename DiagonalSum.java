import java.util.*;

public class DiagonalSum {

    static class Solution {

        public int diagonalSum(int[][] mat) {
            int r = mat.length;
            int c = mat[0].length;
            int j = c - 1;
            int sum = 0;

            for (int i = 0; i < r; i++, j--) {
                if (i == j)
                    sum += mat[i][i];
                else
                    sum += mat[i][i] + mat[i][j];
            }

            return sum;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        // Sample input
        int[][] mat = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int result = solution.diagonalSum(mat);

        System.out.println("Diagonal Sum: " + result);
    }
}