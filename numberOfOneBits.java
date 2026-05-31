import java.util.Scanner;

class Solution {

    public int hammingWeight(int n) {

        int count = 0;

        while (n > 0) {

            if ((n % 2) == 1)
                count++;

            n /= 2;
        }

        return count;
    }
}

public class numberOfOneBits {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");

        int n = sc.nextInt();

        Solution obj = new Solution();

        int ans = obj.hammingWeight(n);

        System.out.println(
                "Number of 1 bits = " + ans);

        sc.close();
    }
}