import java.util.*;
class q92 {
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public ListNode specialcaseleft(ListNode head, int right){
        ListNode prev=null,curr=head,curr2=head,temp;int current=1;

        while(current<=right){
            temp=curr.next;
            curr.next=prev;
            prev=curr;
            curr=temp;
            current++;
        }
        curr2.next=curr;
        return prev;
    }
    public ListNode reverseBetween(ListNode head, int left, int right) {

            if(head.next==null)
                return head;
            int current=0;ListNode curr=head, prev=null,leftmost=head,temp,anchor=head;

            //left == 1 means no anchor

            if(left==1)
                return specialcaseleft(head,right);
            if(left==right)
                return head;
            while(current<right){
                current++;
                if(current==left){
                    prev.next=null;
                    leftmost=curr;
                    anchor=prev;
                }
                prev=curr;
                curr=curr.next;
            }

            prev.next=null;
            ListNode rightmost=curr;
            //reverse from leftmost
            curr=leftmost;prev=null;
            ListNode curr2=curr;
            while(curr!=null){
                temp=curr.next;
                curr.next=prev;
                prev=curr;
                curr=temp;
            }
            anchor.next=prev;
            curr2.next=rightmost;
            return head;

    }
}
