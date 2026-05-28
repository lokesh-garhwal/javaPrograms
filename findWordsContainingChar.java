import java.util.*;

class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> ans = new ArrayList<>();
        int size = 0;
        String str = "";

        for (int i = 0; i < words.length; i++) {
            size = words[i].length();
            str = words[i];

            for (int j = 0; j < size; j++) {
                if (str.charAt(j) == x) {
                    ans.add(i);
                    break;
                }
            }
        }

        return ans;
    }
}

public class findWordsContainingChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input number of words
        System.out.print("Enter number of words: ");
        int n = sc.nextInt();
        sc.nextLine(); // consume newline

        String[] words = new String[n];

        // Input words
        System.out.println("Enter words:");
        for (int i = 0; i < n; i++) {
            words[i] = sc.nextLine();
        }

        // Input character
        System.out.print("Enter character to search: ");
        char x = sc.next().charAt(0);

        // Create object
        Solution sol = new Solution();

        // Call method
        List<Integer> result = sol.findWordsContaining(words, x);

        // Display result
        System.out.println("Indexes containing '" + x + "':");
        System.out.println(result);

        sc.close();
    }
}