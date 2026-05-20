public class searchIn2DMatrix {

    public static boolean search(int i, int s, int e, int[][] matrix, int target) {

        if (s > e)
            return false;

        int mid = s + (e - s) / 2;

        if (matrix[i][mid] == target) {
            return true;
        }

        if (matrix[i][mid] > target) {
            return search(i, s, mid - 1, matrix, target);
        } else {
            return search(i, mid + 1, e, matrix, target);
        }
    }

    public static boolean searchMatrix(int[][] matrix, int target) {

        int r = matrix.length;
        int c = matrix[0].length;

        boolean res = false;

        for (int i = 0; i < r; i++) {

            if (matrix[i][0] > target)
                return false;

            if (matrix[i][0] == target ||
                matrix[i][c - 1] == target)
                return true;

            if (matrix[i][c - 1] > target) {

                res = search(i, 0, c - 1, matrix, target);

                if (res)
                    return true;

                break;
            }
        }

        return res;
    }

    public static void main(String[] args) {

        int[][] matrix = {
                {1, 3, 5, 7},
                {10, 11, 16, 20},
                {23, 30, 34, 60}
        };

        int target = 16;

        boolean ans = searchMatrix(matrix, target);

        System.out.println("Target found: " + ans);
    }
}