import java.util.*;

class q2807 {
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

    public int gcd(int a, int b) {
        if (b == 0)
            return a;
        return gcd(b, a % b);
    }

    public ListNode insertGreatestCommonDivisors(ListNode head) {
        ListNode curr1 = head, curr2 = head.next;
        if (curr1.next == null)
            return head;
        while (curr2 != null) {
            ListNode nnode = new ListNode();
            nnode.val = gcd(Math.max(curr1.val, curr2.val), Math.min(curr1.val, curr2.val));
            curr1.next = nnode;
            nnode.next = curr2;
            curr1 = curr2;
            curr2 = curr2.next;
        }
        return head;

    }
}
/*
 * Q2807. Insert Greatest Common Divisors in Linked List
 * 
 * Given the head of a linked list head, in which each node contains an integer
 * value.
 * 
 * Between every pair of adjacent nodes, insert a new node with a value equal to
 * the greatest common divisor of them.
 * 
 * Return the linked list after insertion.
 * 
 * The greatest common divisor of two numbers is the largest positive integer
 * that evenly divides both numbers.
 * 
 * 
 * 
 * Example 1:
 * 
 * 
 * Input: head = [18,6,10,3]
 * Output: [18,6,6,2,10,1,3]
 * Explanation: The 1st diagram denotes the initial linked list and the 2nd
 * diagram denotes the linked list after inserting the new nodes (nodes in blue
 * are the inserted nodes).
 * - We insert the greatest common divisor of 18 and 6 = 6 between the 1st and
 * the 2nd nodes.
 * - We insert the greatest common divisor of 6 and 10 = 2 between the 2nd and
 * the 3rd nodes.
 * - We insert the greatest common divisor of 10 and 3 = 1 between the 3rd and
 * the 4th nodes.
 * There are no more adjacent nodes, so we return the linked list.
 * Example 2:
 * 
 * 
 * Input: head = [7]
 * Output: [7]
 * Explanation: The 1st diagram denotes the initial linked list and the 2nd
 * diagram denotes the linked list after inserting the new nodes.
 * There are no pairs of adjacent nodes, so we return the initial linked list.
 * 
 * 
 * Constraints:
 * 
 * The number of nodes in the list is in the range [1, 5000].
 * 1 <= Node.val <= 1000
 */
/*
 * Runtime
 * 2ms Beats 87.16% of users with Java
 * 
 * Memory
 * 45.33MB Beats 10.91% of users with Java
 */