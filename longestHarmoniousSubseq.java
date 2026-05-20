import java.util.Arrays;

public class longestHarmoniousSubseq {

    public int findLHS(int[] nums) {

        Arrays.sort(nums);

        int i = 0;
        int n = nums.length;
        int nst = 0;
        int templength = 0;
        int res = 0;
        boolean update = false;

        for (int j = 1; j < n; j++) {

            if (nums[i] == nums[j])
                continue;

            if (update == false) {
                nst = j;
                update = true;
            }

            if ((nums[j] - nums[i]) == 1) {
                continue;
            }

            if (nums[j - 1] != nums[i]) {
                templength = j - i;

                if (templength > res)
                    res = templength;
            }

            i = nst;
            update = false;
            j--;
        }

        if (update)
            templength = (n - i);

        if (templength > res)
            return templength;

        return res;
    }

    public static void main(String[] args) {

        int[] nums = {1, 3, 2, 2, 5, 2, 3, 7};

        longestHarmoniousSubseq obj = new longestHarmoniousSubseq();

        int result = obj.findLHS(nums);

        System.out.println("Longest Harmonious Subsequence length: " + result);
    }
}