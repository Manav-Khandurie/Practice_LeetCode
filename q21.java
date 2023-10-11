class q21  {
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {
            next = null;
        }
        ListNode(int x) {
            val = x;
            next = null;
        }
    }
    public ListNode merge(ListNode l1,ListNode l2){
        ListNode nlist=new ListNode();
        ListNode cur1=l1,cur2=l2,curr=nlist;
        while(cur1!=null && cur2!=null){
            //System.out.println("here");
            ListNode nnode=new ListNode();
            if(cur1.val<cur2.val){
                nnode.val=cur1.val;
                //move cur1 
                cur1=cur1.next;
                curr.next=nnode;
                curr=nnode;
            }
            else if(cur1.val>cur2.val){
                nnode.val=cur2.val;
                //move cur2 
                cur2=cur2.next;
                curr.next=nnode;
                curr=nnode;
            }
            else {
                // we can move any one so move cur1
                nnode.val=cur1.val;
                //move cur1 
                cur1=cur1.next;
                curr.next=nnode;
                curr=nnode;
            }
        }
        //Now fill up the remainder lists
        nlist=nlist.next;//extra space removal
        if(cur1!=null)
            curr.next=cur1;
        if(cur2!=null)
            curr.next=cur2;
        return nlist;
    }
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1==null && list2==null)
            return null;
        else if(list1==null && list2!=null)
            return list2;
        else if(list2==null && list1!=null)
            return list1;
        ListNode nlist=merge(list1,list2);
        return nlist;
    }
}
/*
Q21 Merge Two Sorted Lists

You are given the heads of two sorted linked lists list1 and list2.

Merge the two lists into one sorted list. The list should be made by splicing together the nodes of the first two lists.

Return the head of the merged linked list.

 

Example 1:


Input: list1 = [1,2,4], list2 = [1,3,4]
Output: [1,1,2,3,4,4]
Example 2:

Input: list1 = [], list2 = []
Output: []
Example 3:

Input: list1 = [], list2 = [0]
Output: [0]
 

Constraints:

The number of nodes in both lists is in the range [0, 50].
-100 <= Node.val <= 100
Both list1 and list2 are sorted in non-decreasing order.
 */
/*
Java
Runtime
1 ms
Beats
6.1%

Memory
41.8 MB
Beats
13.69%
 */