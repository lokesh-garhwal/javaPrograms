import java.util.PriorityQueue;

class ListNode {
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

public class sortList {

    public static ListNode sortList(ListNode head) {

        if (head == null || head.next == null)
            return head;

        PriorityQueue<ListNode> pq =
                new PriorityQueue<>((a, b) -> a.val - b.val);

        ListNode curr = head;
        ListNode temp;

        // Add all nodes to priority queue
        while (curr != null) {
            temp = curr;
            curr = curr.next;
            temp.next = null;
            pq.add(temp);
        }

        head = null;
        curr = null;

        // Rebuild sorted linked list
        while (!pq.isEmpty()) {

            temp = pq.remove();

            if (head == null) {
                head = temp;
                curr = temp;
            } else {
                curr.next = temp;
                curr = curr.next;
            }
        }

        return head;
    }

    // Print linked list
    public static void printList(ListNode head) {

        ListNode curr = head;

        while (curr != null) {
            System.out.print(curr.val + " -> ");
            curr = curr.next;
        }

        System.out.println("null");
    }

    public static void main(String[] args) {

        // Create linked list:
        // 4 -> 2 -> 1 -> 3

        ListNode head = new ListNode(4);
        head.next = new ListNode(2);
        head.next.next = new ListNode(1);
        head.next.next.next = new ListNode(3);

        System.out.println("Original List:");
        printList(head);

        head = sortList(head);

        System.out.println("Sorted List:");
        printList(head);
    }
}