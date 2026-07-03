import java.util.*;

public class MergeNodesInBetweenZeros {

    static class ListNode {
        int val;
        ListNode next;

        ListNode() {}

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    static class Solution {

        public ListNode mergeNodes(ListNode head) {
            ListNode resList = new ListNode();
            ListNode temp = resList;
            ListNode curr = head.next;

            int res = 0;

            while (curr != null) {
                if (curr.val != 0) {
                    res += curr.val;
                } else {
                    temp.next = new ListNode(res);
                    temp = temp.next;
                    res = 0;
                }
                curr = curr.next;
            }

            return resList.next;
        }
    }

    // helper to build linked list from array
    public static ListNode build(int[] arr) {
        ListNode dummy = new ListNode();
        ListNode temp = dummy;

        for (int v : arr) {
            temp.next = new ListNode(v);
            temp = temp.next;
        }

        return dummy.next;
    }

    // helper to print linked list
    public static void print(ListNode head) {
        List<Integer> list = new ArrayList<>();

        while (head != null) {
            list.add(head.val);
            head = head.next;
        }

        System.out.println(list);
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        // Sample input
        int[] arr = {0, 3, 1, 0, 4, 5, 2, 0};

        ListNode head = build(arr);

        ListNode result = solution.mergeNodes(head);

        System.out.print("Merged Nodes: ");
        print(result);
    }
}