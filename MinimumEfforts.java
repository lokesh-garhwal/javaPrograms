import java.util.*;

public class MinimumEfforts {

    static class cust {
        int diff;
        int idx;

        cust() {}

        cust(int diff, int idx) {
            this.diff = diff;
            this.idx = idx;
        }
    }

    static class Solution {

        public int minimumEffort(int[][] tasks) {
            int r = tasks.length;
            int c = tasks[0].length;

            int start = 0;
            int diff = 0;

            PriorityQueue<cust> pq = new PriorityQueue<>((a, b) -> b.diff - a.diff);

            for (int i = 0; i < r; i++) {
                diff = tasks[i][1] - tasks[i][0];
                pq.add(new cust(diff, i));
            }

            start = pq.peek().diff;
            int curr = start;
            int currIdx;

            for (int i = 0; i < r; i++) {
                currIdx = pq.peek().idx;

                if (curr >= tasks[currIdx][1]) {
                    curr -= tasks[currIdx][0];
                    pq.poll();
                } else {
                    diff = tasks[currIdx][1] - curr;
                    start += diff;
                    curr += diff;
                    i--;
                }
            }

            return start;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        // Sample input
        int[][] tasks = {
                {1, 3},
                {2, 4},
                {10, 11},
                {10, 12}
        };

        int result = solution.minimumEffort(tasks);

        System.out.println("Minimum Effort: " + result);
    }
}