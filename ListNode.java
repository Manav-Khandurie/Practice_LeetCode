public class ListNode {
    int val;
    ListNode next;

    ListNode() {

    }

    ListNode(int x) {
        val = x;
        next = null;
    }

    ListNode(int x, ListNode t) {
        val = x;
        next = t;
    }
}