import java.util.Scanner;

class Solution {

    public static StringBuilder invert(StringBuilder sb2) {
        for (int x = 0; x < sb2.length(); x++) {
            if (sb2.charAt(x) == '0')
                sb2.setCharAt(x, '1');
            else
                sb2.setCharAt(x, '0');
        }
        return sb2;
    }

    public static void solve(StringBuilder sb, int n, int i, StringBuilder sb2) {
        if (i == n)
            return;

        sb2 = invert(sb2);
        sb2.reverse();

        sb.append("1");
        sb.append(sb2);

        sb2.setLength(0);

        solve(sb, n, i + 1, sb2.append(sb));

        return;
    }

    public char findKthBit(int n, int k) {
        if (n == 1)
            return '0';

        StringBuilder sb = new StringBuilder("0");
        StringBuilder sb2 = new StringBuilder("0");

        solve(sb, n, 1, sb2);

        return sb.charAt(k - 1);
    }
}

public class findKBitinNBinaryStr {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        System.out.print("Enter k: ");
        int k = sc.nextInt();

        Solution obj = new Solution();

        char ans = obj.findKthBit(n, k);

        System.out.println("Kth Bit = " + ans);

        sc.close();
    }
}