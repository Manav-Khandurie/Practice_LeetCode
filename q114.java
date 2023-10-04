import java.util.ArrayList;
class q114 {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
    ArrayList<TreeNode> ls=new ArrayList<>();

    public void preorder(TreeNode root){
        if(root==null)
            return ;
        ls.add(root);
        preorder(root.left);
        preorder(root.right);
    }

    public void form(TreeNode root,int u){
        if(root==null)
            return;
        root.left=null;
        root.right=ls.get(u);
        form(root.right,u+1);
    }

    public void flatten(TreeNode root) {
        if(root==null)
            return ;
        preorder(root);
        ls.add(null);//final node will be a null
        form(root,0);
        return ;
    }
}

/*
Runtime
Details
0ms
Beats 100.00%of users with Java


Memory
Details
40.74MB
Beats 73.80%of users with Java



114. Flatten Binary Tree to Linked List


Given the root of a binary tree, flatten the tree into a "linked list":

The "linked list" should use the same TreeNode class where the right child pointer points to the next node in the list and the left child pointer is always null.
The "linked list" should be in the same order as a pre-order traversal of the binary tree.
 

Example 1:


Input: root = [1,2,5,3,4,null,6]
Output: [1,null,2,null,3,null,4,null,5,null,6]
 */