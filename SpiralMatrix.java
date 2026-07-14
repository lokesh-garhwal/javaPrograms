import java.util.*;

public class SpiralMatrix {

    static class Solution {

        public List<Integer> spiralOrder(int[][] matrix) {

            List<Integer> list = new ArrayList<>();
            int r = matrix.length;
            int c = matrix[0].length;
            int loopCount = 0;

            if (r == 1) {
                for (int i = 0; i < c; i++) {
                    list.add(matrix[0][i]);
                }

            } else if (c == 1) {
                for (int i = 0; i < r; i++) {
                    list.add(matrix[i][0]);
                }

            } else {
                while ((r / 2) + 1 > loopCount) {
                    if (list.size() == r * c)
                        break;

                    for (int i = loopCount; i < c - loopCount; i++) {
                        list.add(matrix[loopCount][i]);
                    }

                    if (list.size() == r * c)
                        break;

                    for (int j = loopCount + 1; j < r - loopCount; j++) {
                        list.add(matrix[j][c - 1 - loopCount]);
                    }

                    if (list.size() == r * c)
                        break;

                    for (int k = c - 2 - loopCount; k > loopCount; k--) {
                        list.add(matrix[r - 1 - loopCount][k]);
                    }

                    if (list.size() == r * c)
                        break;

                    for (int l = r - 1 - loopCount; l > loopCount; l--) {
                        list.add(matrix[l][loopCount]);
                    }

                    loopCount++;
                }
            }

            return list;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        // Sample input
        int[][] matrix = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12}
        };

        List<Integer> result = solution.spiralOrder(matrix);

        System.out.println("Spiral Order:");
        System.out.println(result);
    }
}