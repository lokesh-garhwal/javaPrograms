import java.util.*;

public class NumOfLaserBeans {

    static class Solution {

        public int numberOfBeams(String[] bank) {
            int r = bank.length;
            int c = bank[0].length();

            int beam = 0;
            int prev = 0;
            int res = 0;

            for (int i = 0; i < bank.length; i++) {
                for (int j = 0; j < c; j++) {
                    if ((bank[i].charAt(j)) == '1')
                        beam++;
                }

                if (beam != 0) {
                    if (prev != 0)
                        res += (prev * beam);

                    prev = beam;
                    beam = 0;
                }
            }

            return res;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        // Sample input
        String[] bank = {
                "011001",
                "000000",
                "010100",
                "001000"
        };

        int result = solution.numberOfBeams(bank);

        System.out.println("Number of Beams: " + result);
    }
}