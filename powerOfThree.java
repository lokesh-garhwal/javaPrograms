import java.util.Scanner;

class Solution {

    public static boolean find(int x, int n, int i) {

        if (n == 2147483647)
            return false;

        if (i > 30)
            return false;

        if ((int) Math.pow(x, i) == n)
            return true;

        if ((int) Math.pow(x, i) > n)
            return false;

        return find(x, n, i + 1);
    }

    public boolean isPowerOfThree(int n) {

        if (n <= 0)
            return false;

        return find(3, n, 0);
    }
}

public class powerOfThree {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");

        int n = sc.nextInt();

        Solution obj = new Solution();

        boolean ans = obj.isPowerOfThree(n);

        System.out.println(
                "Is Power of Three: " + ans);

        sc.close();
    }
}