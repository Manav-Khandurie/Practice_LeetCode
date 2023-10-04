/*
// Definition for a Node.
class Node {
    public int val;
    public Node prev;
    public Node next;
    public Node child;
};
*/

import java.util.Stack;

class q430 {
    class Node {
        public int val;
        public Node prev;
        public Node next;
        public Node child;
    };
    public Node flatten(Node head) {
        
        Node curr=head,prev=null;
        Stack<Node> stk=new Stack<Node>();
        while(curr!=null){
            if(curr.child!=null){
                stk.push(curr.next);
                curr.next=curr.child;
                curr.child=null;
            }
            curr.prev=prev;
            if(prev!=null)
                prev.next=curr;
            prev=curr;
            curr=curr.next;
            if(!stk.isEmpty() && curr==null){
                curr=stk.pop();
                prev.next=curr;
            }
            //else if(!stk.isEmpty())
            //System.out.println(!stk.isEmpty() && curr==null);
        }
        //System.out.println(stk);
        //System.out.println(prev+" "+curr);
        // while(!stk.isEmpty()){
        //             System.out.println("here");
        //     ele=stk.pop();
        //     prev.next=ele;
        //     prev=ele;
        //     curr=ele.next;
        // }
        while(!stk.isEmpty()){
        if(!stk.isEmpty())
        curr=stk.pop();
        while(curr!=null){
            curr.prev=prev;
            if(prev!=null)
                prev.next=curr;
            prev=curr;
            curr=curr.next;
        }
        }
        return head;
    }
}

/*
 * 
You are given a doubly linked list, which contains nodes that have a next pointer, a previous pointer, and an additional child pointer. This child pointer may or may not point to a separate doubly linked list, also containing these special nodes. These child lists may have one or more children of their own, and so on, to produce a multilevel data structure as shown in the example below.

Given the head of the first level of the list, flatten the list so that all the nodes appear in a single-level, doubly linked list. Let curr be a node with a child list. The nodes in the child list should appear after curr and before curr.next in the flattened list.

Return the head of the flattened list. The nodes in the list must have all of their child pointers set to null.

 
 */
/*
Runtime
Details
1ms
Beats 28.45%of users with Java

Memory
Details
40.31MB
Beats 68.81%of users with Java
 */