import java.util.*;

class Solution {
    public int maxDistinct(String s) {
        Set<Character> set = new HashSet<>();

        for (int i = 0; i < s.length(); i++) {
            set.add(s.charAt(i));
        }

        return set.size();
    }
}

public class maxStrWithDistintStart {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input string
        System.out.print("Enter a string: ");
        String s = sc.nextLine();

        // Create object
        Solution sol = new Solution();

        // Call method
        int result = sol.maxDistinct(s);

        // Display result
        System.out.println("Maximum distinct characters: " + result);

        sc.close();
    }
}