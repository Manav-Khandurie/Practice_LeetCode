/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class q237 {
    public void deleteNode(ListNode head) {
        //[4,5,1,9]
        //   i j
        //[4,1,1,9]
        //     i j
        //[4,1,9,9]
        //       i j

        ListNode curr=head.next;
        while(curr.next!=null){
            head.val=curr.val;
            head=head.next;
            curr=curr.next;
        }
        head.val=curr.val;
        head.next=null;
    }
}