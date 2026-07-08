import java.util.*;

public class SetMatrixZeros {

    static class Solution {

        public void setZeroes(int[][] matrix) {
            int r = matrix.length;
            int c = matrix[0].length;

            boolean[][] used = new boolean[r][c];

            for (int i = 0; i < r; i++) {
                for (int j = 0; j < c; j++) {
                    if (matrix[i][j] == 0)
                        used[i][j] = true;
                }
            }

            for (int i = 0; i < r; i++) {
                for (int j = 0; j < c; j++) {
                    if (used[i][j] && (matrix[i][j] == 0)) {
                        for (int k = 0; k < c; k++) {
                            matrix[i][k] = 0;
                        }

                        for (int k = 0; k < r; k++) {
                            matrix[k][j] = 0;
                        }
                    }
                }
            }

            return;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        // Sample input
        int[][] matrix = {
            {1, 1, 1},
            {1, 0, 1},
            {1, 1, 1}
        };

        solution.setZeroes(matrix);

        // Print the modified matrix
        System.out.println("Modified Matrix:");
        for (int[] row : matrix) {
            System.out.println(Arrays.toString(row));
        }
    }
}