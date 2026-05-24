import java.util.Scanner;

class Solution {

    public String largestOddNumber(String num) {

        int i = num.length() - 1;

        while (i >= 0) {

            if ((num.charAt(i) - '0') % 2 == 1) {
                return num.substring(0, i + 1);
            }

            i--;
        }

        return "";
    }
}

public class largestOddNumberInStr {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");

        String num = sc.next();

        Solution obj = new Solution();

        String ans = obj.largestOddNumber(num);

        System.out.println(
            "Largest Odd Number: " + ans
        );

        sc.close();
    }
}