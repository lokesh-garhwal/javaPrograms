import java.util.*;

public class IntToRoman {

    static class Solution {

        public String intToRoman(int num) {

            StringBuilder sb = new StringBuilder();
            int n = 0;

            while (num > 0) {
                n = num;

                while (n >= 10) {
                    n /= 10;
                }

                if (n == 4 || n == 9) {
                    if (num < 5) {
                        sb.append("IV");
                        num -= 4;
                    } else if (num < 10) {
                        sb.append("IX");
                        num -= 9;
                    } else if (num < 50) {
                        sb.append("XL");
                        num -= 40;
                    } else if (num < 100) {
                        sb.append("XC");
                        num -= 90;
                    } else if (num < 500) {
                        sb.append("CD");
                        num -= 400;
                    } else {
                        sb.append("CM");
                        num -= 900;
                    }
                } else {
                    if (num >= 1000) {
                        num -= 1000;
                        sb.append("M");
                    } else if (num >= 500) {
                        num -= 500;
                        sb.append("D");
                    } else if (num >= 100) {
                        num -= 100;
                        sb.append("C");
                    } else if (num >= 50) {
                        num -= 50;
                        sb.append("L");
                    } else if (num >= 10) {
                        num -= 10;
                        sb.append("X");
                    } else if (num >= 5) {
                        num -= 5;
                        sb.append("V");
                    } else {
                        num -= 1;
                        sb.append("I");
                    }
                }
            }

            return sb.toString();
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        // Sample input
        int num = 1994;

        String result = solution.intToRoman(num);

        System.out.println("Roman Numeral: " + result);
    }
}