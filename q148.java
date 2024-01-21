import java.util.*;

class q148 {

    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public ListNode mergeSort(ListNode head) {
        int n = 0;
        ListNode curr1 = head, curr2 = head, prev = null;
        if (head.next == null)
            return head;

        while (curr2 != null && curr2.next != null) {
            prev = curr1;
            curr1 = curr1.next;
            curr2 = curr2.next.next;
        }
        prev.next = null;
        curr2 = head;
        curr1 = mergeSort(curr1);
        curr2 = mergeSort(curr2);

        return merge(curr1, curr2);
    }

    public ListNode merge(ListNode curr1, ListNode curr2) {
        ListNode l = curr1, r = curr2;
        ListNode nnode = new ListNode();
        ListNode nhead = nnode;
        while (l != null && r != null) {
            ListNode newNode = new ListNode();
            if (l.val < r.val) {
                newNode.val = l.val;
                nnode.next = newNode;
                nnode = nnode.next;
                l = l.next;
                continue;
            }
            newNode.val = r.val;
            nnode.next = newNode;
            nnode = nnode.next;
            r = r.next;
        }

        while (r != null) {
            ListNode newNode = new ListNode(r.val);
            nnode.next = newNode;
            nnode = nnode.next;
            r = r.next;
        }

        while (l != null) {
            ListNode newNode = new ListNode(l.val);
            nnode.next = newNode;
            nnode = nnode.next;
            l = l.next;
        }
        return nhead.next;
    }

    public ListNode sortList(ListNode head) {
        if (head == null)
            return head;
        return mergeSort(head);
        // return head;
    }
}
/*
 * Given the head of a linked list, return the list after sorting it in
 * ascending order.
 * 
 * 
 * 
 * Example 1:
 * 
 * 
 * Input: head = [4,2,1,3]
 * Output: [1,2,3,4]
 * Example 2:
 * 
 * 
 * Input: head = [-1,5,3,4,0]
 * Output: [-1,0,3,4,5]
 * Example 3:
 * 
 * Input: head = []
 * Output: []
 * 
 * 
 * Constraints:
 * 
 * The number of nodes in the list is in the range [0, 5 * 104].
 * -105 <= Node.val <= 105
 * 
 * 
 * Follow up: Can you sort the linked list in O(n logn) time and O(1) memory
 * (i.e. constant space)?
 */
/*
 * Runtime
 * 13ms Beats 33.18% of users with Java
 * 
 * Memory
 * 55.74MB Beats 71.80% of users with Java
 */