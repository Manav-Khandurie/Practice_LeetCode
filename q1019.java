import java.util.*;

class q1019 {
    int n = 0;

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

    public ListNode getReverse(ListNode head) {
        ListNode prev = null;
        while (head != null) {
            ListNode t = head.next;
            head.next = prev;
            prev = head;
            head = t;
            n++;
        }
        return prev;
    }

    public int[] nextLargerNodes(ListNode head) {

        Stack<Integer> stk = new Stack<>();
        head = getReverse(head);
        int k = n - 1, ele;
        int arr[] = new int[n];
        while (head != null) {
            ele = head.val;
            // System.out.println(stk);
            while (!stk.isEmpty() && ele >= stk.peek())
                stk.pop();
            arr[k--] = (stk.isEmpty()) ? 0 : stk.peek();
            head = head.next;
            stk.push(ele);
        }
        return arr;
    }
}
/*
 * Q1019. Next Greater Node In Linked List
 * 
 * You are given the head of a linked list with n nodes.
 * 
 * For each node in the list, find the value of the next greater node. That is,
 * for each node, find the value of the first node that is next to it and has a
 * strictly larger value than it.
 * 
 * Return an integer array answer where answer[i] is the value of the next
 * greater node of the ith node (1-indexed). If the ith node does not have a
 * next greater node, set answer[i] = 0.
 * 
 * 
 * 
 * Example 1:
 * 
 * 
 * Input: head = [2,1,5]
 * Output: [5,5,0]
 * Example 2:
 * 
 * 
 * Input: head = [2,7,4,3,5]
 * Output: [7,0,5,5,0]
 * 
 * 
 * Constraints:
 * 
 * The number of nodes in the list is n.
 * 1 <= n <= 104
 * 1 <= Node.val <= 109
 */
/*
 * Runtime
 * 26ms Beats 53.32% of users with Java
 * 
 * Memory
 * 45.96MB Beats 98.79% of users with Java
 */