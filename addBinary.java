import java.util.Scanner;

class Solution {

    public String addBinary(String a, String b) {

        int i = a.length() - 1;
        int j = b.length() - 1;

        int sum = 0;
        int carry = 0;

        StringBuilder res =
                new StringBuilder();

        while (i >= 0 || j >= 0 || carry == 1) {

            sum = 0;

            if (i >= 0)
                sum += a.charAt(i--) - '0';

            if (j >= 0)
                sum += b.charAt(j--) - '0';

            sum += carry;

            res.insert(0, sum % 2);

            carry = sum / 2;
        }

        return res.toString();
    }
}

public class addBinary {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print(
        "Enter first binary number: ");

        String a = sc.next();

        System.out.print(
        "Enter second binary number: ");

        String b = sc.next();

        Solution obj =
        new Solution();

        String ans =
        obj.addBinary(a, b);

        System.out.println(
        "Binary Sum = " + ans);

        sc.close();
    }
}