import java.util.*;

class q23 {
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

    public ListNode merge(ListNode a, ListNode b) {
        ListNode newlist = new ListNode();
        ListNode curr = newlist;
        while (a != null && b != null) {
            ListNode nnode = new ListNode();

            if (a.val > b.val) {
                nnode.val = b.val;
                b = b.next;
            } else {
                nnode.val = a.val;
                a = a.next;
            }

            curr.next = nnode;
            curr = curr.next;
        }
        while (a != null) {
            ListNode nnode = new ListNode(a.val);
            curr.next = nnode;
            curr = curr.next;
            a = a.next;
        }
        while (b != null) {
            ListNode nnode = new ListNode(b.val);
            curr.next = nnode;
            curr = curr.next;
            b = b.next;
        }
        return newlist.next;
    }

    public ListNode mergeKLists(ListNode[] lists) {
        if (lists.length == 0)
            return null;
        if (lists.length == 1)
            return lists[0];
        ListNode t = merge(lists[0], lists[1]);
        for (int i = 2; i < lists.length; i++) {
            if (lists[i] != null)
                t = merge(t, lists[i]);
        }
        return t;
    }
}
/*
 * Q23. Merge k Sorted Lists
 * 
 * You are given an array of k linked-lists lists, each linked-list is sorted in
 * ascending order.
 * 
 * Merge all the linked-lists into one sorted linked-list and return it.
 * 
 * 
 * 
 * Example 1:
 * 
 * Input: lists = [[1,4,5],[1,3,4],[2,6]]
 * Output: [1,1,2,3,4,4,5,6]
 * Explanation: The linked-lists are:
 * [
 * 1->4->5,
 * 1->3->4,
 * 2->6
 * ]
 * merging them into one sorted list:
 * 1->1->2->3->4->4->5->6
 * Example 2:
 * 
 * Input: lists = []
 * Output: []
 * Example 3:
 * 
 * Input: lists = [[]]
 * Output: []
 * 
 * 
 * Constraints:
 * 
 * k == lists.length
 * 0 <= k <= 104
 * 0 <= lists[i].length <= 500
 * -104 <= lists[i][j] <= 104
 * lists[i] is sorted in ascending order.
 * The sum of lists[i].length will not exceed 104.
 */
/*
 * Runtime
 * 106ms Beats 10.75% of users with Java
 * 
 * Memory
 * 45.89MB Beats 5.30% of users with Java
 */