class q19 {
    class ListNode {
     int val;
     ListNode next;
     ListNode() {}
     ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int size=0,i=0;
        ListNode curr=head,prev=null;
        if(head.next==null)
            return null;

        while(curr!=null){
            size++;
            prev=curr;
            curr=curr.next;
        }
        if(n==1){
            //remove last ele
            curr=head;prev=null;
            while(curr!=null && curr.next!=null){
                prev=curr;
                curr=curr.next;
            }
            prev.next=null;
            return head;
        }
        if(n==size){
            //remove first ele
            return head.next;
        }
        n=size-n;
        
        prev=null;curr=head;
        i=1;
        while(i<=n && curr!=null){
            prev=curr;
            //System.out.println(i+","+n);
            curr=curr.next;
            i++;
        }
        prev.next=curr.next;
        curr.next=null;
        return head;
    }
}