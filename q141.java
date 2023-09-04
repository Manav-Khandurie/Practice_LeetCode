

import java.util.*;
public class q141  extends ListNode{


    q141(int x) {
        super(x);
        //TODO Auto-generated constructor stub
    }

    public boolean hasCycle(ListNode head) {

        ListNode fast=head;
        if(head==null)
            return false;
        if(head.next==null)
            return false;
        while(fast!=null &&fast.next!=null){
            if(head.next!=null)
            head=head.next;
            if(fast.next!=null)
            fast=fast.next.next;
            if(head==fast)
                return true;
        }
        return false;
    }

    public static void main(String args[]){
        q141 obj=new q141(0);
        System.out.println(obj.hasCycle(null));
    }
}

/***

public class Solution {
    public boolean hasCycle(ListNode head) {
        HashSet<ListNode> seen=new HashSet<ListNode>();
        ListNode curr=head;
        while(curr!=null){
            //System.out.println(seen);
            if(seen.contains(curr)==true){
                // System.out.println(curr);
                return true;
            }
            seen.add(curr);
            curr=curr.next;
        }
        return false;
    }
}
 */