import java.util.Scanner;

class Solution {

    public static boolean find(int x, int n, int i) {

        if (i > 30)
            return false;

        if ((int) Math.pow(x, i) == n)
            return true;

        if ((int) Math.pow(x, i) > n)
            return false;

        System.out.println(
                i + " " +
                (int) Math.pow(x, i)
                + " " + n);

        return find(x, n, i + 1);
    }

    public boolean isPowerOfTwo(int n) {

        return find(2, n, 0);
    }
}

public class powerOfTwo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print(
        "Enter number: ");

        int n = sc.nextInt();

        Solution obj =
        new Solution();

        boolean ans =
        obj.isPowerOfTwo(n);

        System.out.println(
        "Is Power of Two: " + ans);

        sc.close();
    }
}