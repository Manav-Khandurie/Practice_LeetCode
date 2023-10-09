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
class q234 {
    public class ListNode 
    {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public boolean isPalindrome(ListNode head) {
        //Reach middle of LL and then compare both
        //int len=1;
        ListNode curr1=head,curr2=head,prev=null,temp;
        if(head.next==null)
            return true;
        while(curr2!=null && curr2.next!=null){
            curr1=curr1.next;
            curr2=curr2.next.next;
            //len+=2;
        } 
        // if(curr2==null)//list is even dec len by 1
        //     len-=1;
        // if(len%2!=0)//odd len
        //     curr1=curr1.next;
        
        //Rev 2nd half cur1
        curr2=curr1;
        while(curr2!=null){
            temp=curr2.next;
            curr2.next=prev;
            prev=curr2;
            curr2=temp;
        }
        curr2=head;
        while(curr2!=null && prev!=null){
            if(curr2.val!=prev.val)
                return false;
            prev=prev.next;
            curr2=curr2.next;
        }

        return true;
    }
}