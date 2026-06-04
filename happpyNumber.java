import java.util.*;

class Solution {
    public boolean isHappy(int n) {
        Set<Integer> set = new HashSet<>();
        int temp;
        int num = 0;

        while (true) {
            while (n > 0) {
                temp = n % 10;
                n /= 10;
                num += temp * temp;
            }

            if (num != 1) {
                if (!set.contains(num)) {
                    set.add(num);
                    n = num;
                    num = 0;
                } else {
                    return false;
                }
            } else {
                return true;
            }
        }
    }
}

public class happpyNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // User input
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        // Create object
        Solution sol = new Solution();

        // Call method
        boolean result = sol.isHappy(n);

        // Display result
        if (result) {
            System.out.println(n + " is a Happy Number.");
        } else {
            System.out.println(n + " is not a Happy Number.");
        }

        sc.close();
    }
}