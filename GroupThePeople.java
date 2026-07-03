import java.util.*;

public class GroupThePeople {

    static class Solution {

        public List<List<Integer>> groupThePeople(int[] groupSizes) {
            Map<Integer, List<Integer>> map = new HashMap<>();
            List<List<Integer>> res = new ArrayList<>();
            int i = 0;

            while (i < groupSizes.length) {
                map.putIfAbsent(groupSizes[i], new ArrayList<>());
                map.get(groupSizes[i]).add(i);

                if (groupSizes[i] == map.get(groupSizes[i]).size()) {
                    res.add(new ArrayList<>(map.get(groupSizes[i])));
                    map.get(groupSizes[i]).clear();
                }

                i++;
            }

            return res;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        // Sample input
        int[] groupSizes = {3, 3, 3, 3, 3, 1, 3};

        List<List<Integer>> result = solution.groupThePeople(groupSizes);

        System.out.println("Grouped People:");
        System.out.println(result);
    }
}