/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

import java.util.ArrayList;
import java.util.List;

class q138 {
    class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
    }
    public Node copyRandomList(Node head) {
        //Node nlist=new Node(0);
        Node nlist=new Node(0);
        List<Node> firstlist=new ArrayList<Node>();
        List<Node> secondlist=new ArrayList<Node>();
        Node curr1=head,curr=nlist;
        while(curr1!=null){
            Node nnode=new Node(curr1.val);
            curr.next=nnode;
            curr=nnode;
            secondlist.add(curr);
            firstlist.add(curr1);
            curr1=curr1.next;
        }
        firstlist.add(null);
        secondlist.add(null);
        List<Integer> firstlistrandom=new ArrayList<>();
        curr1=head;
        int pos=0;
        while(curr1!=null){
            pos=firstlist.indexOf(curr1.random);
            firstlistrandom.add(pos);
            curr1=curr1.next;
        }
        Integer v=0;
        curr=nlist.next;
        while(curr!=null){
            pos=firstlistrandom.get(v);
            curr.random=secondlist.get(pos);
            curr=curr.next;
            v=v+1;
        }
        

        return nlist.next;
    }
}


/*
Copy List with Random Pointer


A linked list of length n is given such that each node contains an additional random pointer, which could point to any node in the list, or null.

Construct a deep copy of the list. The deep copy should consist of exactly n brand new nodes, where each new node has its value set to the value of its corresponding original node. Both the next and random pointer of the new nodes should point to new nodes in the copied list such that the pointers in the original list and copied list represent the same list state. None of the pointers in the new list should point to nodes in the original list.

For example, if there are two nodes X and Y in the original list, where X.random --> Y, then for the corresponding two nodes x and y in the copied list, x.random --> y.

Return the head of the copied linked list.

The linked list is represented in the input/output as a list of n nodes. Each node is represented as a pair of [val, random_index] where:

val: an integer representing Node.val
random_index: the index of the node (range from 0 to n-1) that the random pointer points to, or null if it does not point to any node.
Your code will only be given the head of the original linked list.
 */