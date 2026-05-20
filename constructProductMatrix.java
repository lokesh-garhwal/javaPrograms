class Solution {

    public int[][] constructProductMatrix(int[][] grid) {

        int r = grid.length;
        int c = grid[0].length;

        int[][] pfix = new int[r][c];
        int[][] sfix = new int[r][c];
        int[][] product = new int[r][c];

        // Prefix matrix
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {

                if (i == 0 && j == 0) {
                    pfix[i][j] = 1;
                    continue;
                }

                if (j == 0) {
                    pfix[i][j] =
                        (int)(((long)grid[i - 1][c - 1]
                        * pfix[i - 1][c - 1]) % 12345);
                }
                else {
                    pfix[i][j] =
                        (int)(((long)grid[i][j - 1]
                        * pfix[i][j - 1]) % 12345);
                }
            }
        }

        // Suffix matrix
        for (int i = r - 1; i >= 0; i--) {
            for (int j = c - 1; j >= 0; j--) {

                if (i == r - 1 && j == c - 1) {
                    sfix[i][j] = 1;
                    continue;
                }

                if (j == c - 1) {
                    sfix[i][j] =
                        (int)(((long)grid[i + 1][0]
                        * sfix[i + 1][0]) % 12345);
                }
                else {
                    sfix[i][j] =
                        (int)(((long)grid[i][j + 1]
                        * sfix[i][j + 1]) % 12345);
                }
            }
        }

        // Final product matrix
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                product[i][j] =
                    (int)(((long)pfix[i][j]
                    * sfix[i][j]) % 12345);
            }
        }

        return product;
    }
}

public class constructProductMatrix {

    public static void printMatrix(int[][] arr) {

        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {

        int[][] grid = {
                {1, 2},
                {3, 4}
        };

        Solution obj = new Solution();

        int[][] result = obj.constructProductMatrix(grid);

        System.out.println("Result Matrix:");

        printMatrix(result);
    }
}