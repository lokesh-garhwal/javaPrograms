import java.util.ArrayList;
import java.util.Collections;

class Pair {
    int value;
    int idx;

    Pair(int value, int idx) {
        this.value = value;
        this.idx = idx;
    }
}

public class sortStdByKthScore {

    public int[][] sortTheStudents(int[][] score, int k) {

        int r = score.length;
        int c = score[0].length;

        ArrayList<Pair> list = new ArrayList<>();
        int[][] res = new int[r][c];

        for (int i = 0; i < r; i++) {
            list.add(new Pair(score[i][k], i));
        }

        Collections.sort(list, (a, b) -> b.value - a.value);

        int idx;

        for (int i = 0; i < r; i++) {
            idx = list.get(i).idx;
            res[i] = score[idx];
        }

        return res;
    }

    public static void main(String[] args) {

        int[][] score = {
                {10, 6, 9, 1},
                {7, 5, 11, 2},
                {4, 8, 3, 15}
        };

        int k = 2;

        sortStdByKthScore obj = new sortStdByKthScore();

        int[][] result = obj.sortTheStudents(score, k);

        System.out.println("Sorted Matrix:");

        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[0].length; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
}