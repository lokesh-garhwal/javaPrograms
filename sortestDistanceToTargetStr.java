import java.util.*;

class Solution {
    public int closestTarget(String[] words, String target, int startIndex) {
        int forword = 0;
        boolean findforward = false;

        for (int i = startIndex; forword < words.length; i++) {
            if (i == words.length) {
                i = -1;
                continue;
            }

            if (words[i].equals(target)) {
                findforward = true;
                break;
            }

            forword++;
        }

        int i = startIndex - 1;
        int backword = 1;
        boolean findbackword = false;

        while (i != startIndex) {
            if (i == -1) {
                i = words.length - 1;
                continue;
            }

            if (words[i].equals(target)) {
                findbackword = true;
                break;
            }

            backword++;
            i--;
        }

        if (findbackword && findforward)
            return (forword < backword) ? forword : backword;
        else if (!findbackword && !findforward)
            return -1;
        else if (!findbackword)
            return forword;
        else
            return backword;
    }
}

public class sortestDistanceToTargetStr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input size of words array
        System.out.print("Enter number of words: ");
        int n = sc.nextInt();
        sc.nextLine(); // consume newline

        String[] words = new String[n];

        // Input words
        System.out.println("Enter words:");
        for (int i = 0; i < n; i++) {
            words[i] = sc.nextLine();
        }

        // Input target
        System.out.print("Enter target word: ");
        String target = sc.nextLine();

        // Input startIndex
        System.out.print("Enter start index: ");
        int startIndex = sc.nextInt();

        // Create object
        Solution sol = new Solution();

        // Call method
        int result = sol.closestTarget(words, target, startIndex);

        // Display result
        System.out.println("Closest distance: " + result);

        sc.close();
    }
}