import java.util.LinkedHashSet;

/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class q142 extends ListNode {
    q142(int x) {
        super(x);
    }

    public ListNode detectCycle(ListNode head) {
        LinkedHashSet<ListNode> lhs=new LinkedHashSet<>();
        //ListNode curr=head;
        while(head!=null){
            if(lhs.contains(head)){
                return head;
            }
            lhs.add(head);
            head=head.next;
        }
        return null;
    }
}