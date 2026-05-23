import java.util.Scanner;

class Solution {

    public boolean judgeCircle(String moves) {

        int R = 0;
        int L = 0;
        int U = 0;
        int D = 0;

        for (int i = 0; i < moves.length(); i++) {

            if (moves.charAt(i) == 'R')
                R++;

            else if (moves.charAt(i) == 'L')
                L++;

            else if (moves.charAt(i) == 'U')
                U++;

            else
                D++;
        }

        return ((U == D) && (R == L))
                ? true
                : false;
    }
}

public class robotReturnToOrigin {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter moves: ");

        String moves = sc.next();

        Solution obj = new Solution();

        boolean ans = obj.judgeCircle(moves);

        System.out.println(
                "Robot returns to origin: " + ans);

        sc.close();
    }
}