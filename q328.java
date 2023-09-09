/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode oddEvenList(ListNode head) {
        //[1,2,3,4,5]
        // o e
        if(head==null)
            return null;
        if(head.next==null)
            return head;
        ListNode o=head,e=head.next,t1=e,temperory;
        while(e!=null && e.next!=null){
            //System.out.println(o.val+","+e.val);
            o.next=e.next;
            o=e.next;

            temperory=e.next;
            e.next=e.next.next;
            e=temperory.next;
        }
        o.next=t1;
        return head;
    }
}




// ListNode p=null,o=head,e=head.next,t1=e,t2=e,t=head;
//         while(o!=null){
//             if(e!=null){
//                 t2=e.next;
//                 o.next=e.next;
//             }
//             if(p!=null)
//                 p.next=e;
//             p=o;
//             if(e!=null)
//                 o=e.next;
//             else
//                 o=e;
//             e=t2.next;
//         }
//         System.out.println(p.val);
//         p.next=t1;
//         return t;