class Solution {
    
    public double myPow(double x, int n) {
        double res = Math.pow(x, n);
        return res;
    }
}

public class PowX_N {

    public static void main(String[] args) {

        Solution obj = new Solution();

        double ans = obj.myPow(2, 10);

        System.out.println(ans);
    }
}