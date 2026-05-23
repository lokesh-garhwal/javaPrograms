import java.util.*;

class Solution {

    public boolean arrayStringsAreEqual(
            String[] word1,
            String[] word2) {

        StringBuilder sb1 =
                new StringBuilder();

        StringBuilder sb2 =
                new StringBuilder();

        for (String s : word1) {
            sb1.append(s);
        }

        for (String s : word2) {
            sb2.append(s);
        }

        System.out.println("String 1 = " + sb1);
        System.out.println("String 2 = " + sb2);

        return (sb1.compareTo(sb2) == 0)
                ? true
                : false;
    }
}

public class iftwoStrArrEquivalent {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print(
            "Enter size of first array: "
        );

        int n1 = sc.nextInt();

        String[] word1 =
                new String[n1];

        System.out.println(
            "Enter first array strings:"
        );

        for (int i = 0; i < n1; i++) {
            word1[i] = sc.next();
        }

        System.out.print(
            "Enter size of second array: "
        );

        int n2 = sc.nextInt();

        String[] word2 =
                new String[n2];

        System.out.println(
            "Enter second array strings:"
        );

        for (int i = 0; i < n2; i++) {
            word2[i] = sc.next();
        }

        Solution obj =
                new Solution();

        boolean ans =
                obj.arrayStringsAreEqual(
                        word1,
                        word2);

        System.out.println(
                "Result = " + ans
        );

        sc.close();
    }
}