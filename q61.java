class q61 {
    
    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }
    }
    public int size(ListNode head){
        int len=0;
        while(head!=null){
            len++;
            head=head.next;
        }
        //System.out.println(len);
        return len;
    }
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null)
            return null;
        if(head.next==null)
            return head;
        ListNode curr,nlist;int len=size(head);
        k=k%len;
        for(int m=1;m<=k;m++){
            curr=head;nlist=null;
            while(curr.next.next!=null)
                curr=curr.next;
            nlist=curr.next;
            curr.next=null;
            nlist.next=head;
            head=nlist;
        }
        return head;
    }
}
/*
Q61 Rotate List 

Given the head of a linked list, rotate the list to the right by k places.

 

Example 1:


Input: head = [1,2,3,4,5], k = 2
Output: [4,5,1,2,3]
Example 2:


Input: head = [0,1,2], k = 4
Output: [2,0,1]
 

Constraints:

The number of nodes in the list is in the range [0, 500].
-100 <= Node.val <= 100
0 <= k <= 2 * 109
 */
/*
Java
Runtime
0 ms
Beats
100%

Memory
41.1 MB
Beats
81.54%
 */