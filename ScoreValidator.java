import java.util.*;

public class ScoreValidator {

    static class Solution {

        public int[] scoreValidator(String[] events) {
            int counter = 0;
            int score = 0;
            int[] res = new int[2];
            int n = 0;

            for (int i = 0; i < events.length; i++) {
                if (counter < 10) {
                    if (events[i].equals("W")) {
                        counter++;
                    } else if (events[i].equals("WD") || events[i].equals("NB")) {
                        score++;
                    } else {
                        n = Integer.parseInt(events[i]);
                        // System.out.println(n);
                        score += n;
                    }
                }
            }

            res[0] = score;
            // System.out.println(res[0]);
            res[1] = counter;

            return res;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        // Sample input
        String[] events = {
                "1", "2", "W", "WD", "4", "NB", "6",
                "W", "W", "3", "2", "W", "1", "W"
        };

        int[] result = solution.scoreValidator(events);

        System.out.println("Score: " + result[0]);
        System.out.println("Wickets: " + result[1]);
    }
}