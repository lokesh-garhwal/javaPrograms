import java.util.*;

class Solution {
    public int mirrorDistance(int n) {
        int num = 0;
        int n1 = n;

        while (n > 0) {
            num *= 10;
            num += n % 10;
            n /= 10;
        }

        return Math.abs(n1 - num);
    }
}

public class mirrorDistanceOfInt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input number
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        // Create object
        Solution sol = new Solution();

        // Call method
        int result = sol.mirrorDistance(n);

        // Display result
        System.out.println("Mirror Distance: " + result);

        sc.close();
    }
}