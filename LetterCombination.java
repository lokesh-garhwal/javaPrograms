import java.util.*;

public class LetterCombination {

    static class Solution {

        public static void solve(String[] strarr, int i, int j, List<String> list, StringBuilder sb, int limit) {
            if (sb.length() == limit) {
                list.add(sb.toString());
                System.out.println(list + " list");
                return;
            }

            if (j == strarr.length)
                return;

            for (int k = 0; k < strarr[j].length(); k++) {
                sb.append(strarr[j].charAt(k));
                solve(strarr, 0, j + 1, list, sb, limit);
                sb.deleteCharAt(sb.length() - 1);
            }
        }

        public List<String> letterCombinations(String digits) {
            Map<Integer, String> map = new HashMap<>();
            List<String> list = new LinkedList<>();
            String[] strarr = new String[digits.length()];

            map.put(2, "abc");
            map.put(3, "def");
            map.put(4, "ghi");
            map.put(5, "jkl");
            map.put(6, "mno");
            map.put(7, "pqrs");
            map.put(8, "tuv");
            map.put(9, "wxyz");

            StringBuilder sb = new StringBuilder();
            int limit = digits.length();
            int curr;

            for (int i = 0; i < limit; i++) {
                curr = digits.charAt(i) - '0';
                strarr[i] = map.get(curr);
            }

            solve(strarr, 0, 0, list, sb, limit);

            return list;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        // Sample input
        String digits = "23";

        List<String> result = solution.letterCombinations(digits);

        System.out.println("Result: " + result);
    }
}