import java.util.*;

class Solution {
    public int maxDistance(int[] colors) {
        int x = 0;

        for (int j = 0; j < colors.length; j++) {

            if (j == 0 || colors[j] != colors[j - 1]) {

                for (int i = colors.length - 1; i >= 0; i--) {

                    if (colors[j] != colors[i]) {

                        if (Math.abs(j - i) > x)
                            x = Math.abs(j - i);

                        break;
                    }
                }
            }
        }

        return x;
    }
}

public class twoFurthestHousesWithDiffColors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input array size
        System.out.print("Enter size of colors array: ");
        int n = sc.nextInt();

        int[] colors = new int[n];

        // Input array elements
        System.out.println("Enter color values:");
        for (int i = 0; i < n; i++) {
            colors[i] = sc.nextInt();
        }

        // Create object
        Solution sol = new Solution();

        // Call method
        int result = sol.maxDistance(colors);

        // Display result
        System.out.println("Maximum distance: " + result);

        sc.close();
    }
}