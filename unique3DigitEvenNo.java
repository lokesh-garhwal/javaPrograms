import java.util.ArrayList;
import java.util.Arrays;

public class unique3DigitEvenNo {

    public static int solve(int[] arr,
            ArrayList<Integer> list,
            boolean[] used,
            int temp,
            int count) {

        if (list.size() == 3) {
            System.out.println(list);

            if (temp % 2 == 0)
                return count + 1;

            return count;
        }

        for (int i = 0; i < arr.length; i++) {

            if ((i > 0) &&
                    (arr[i] == arr[i - 1] && !used[i - 1]))
                continue;

            if ((i == 0) &&
                    (arr[i] == 0) &&
                    (list.size() == 0))
                continue;

            if (used[i])
                continue;

            used[i] = true;

            list.add(arr[i]);

            count = solve(
                    arr,
                    list,
                    used,
                    (temp * 10) + arr[i],
                    count);

            list.remove(list.size() - 1);

            used[i] = false;
        }

        return count;
    }

    public static int totalNumbers(int[] digits) {

        ArrayList<Integer> list = new ArrayList<>();

        Arrays.sort(digits);

        return solve(
                digits,
                list,
                new boolean[digits.length],
                0,
                0);
    }

    public static void main(String[] args) {

        int[] digits = { 2, 1, 3, 0 };

        unique3DigitEvenNo obj = new unique3DigitEvenNo();

        int result = obj.totalNumbers(digits);

        System.out.println("\nTotal valid numbers = " + result);
    }
}