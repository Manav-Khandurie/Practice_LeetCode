
class q104 {
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
    int depth;
    public void traverse(TreeNode root, int depth){
        if(root==null)
            return;
        if(depth>this.depth)
            this.depth=depth;
        traverse(root.left,depth+1);
        traverse(root.right,depth+1);
    }
    public int maxDepth(TreeNode root) {
        this.depth=0;
        if(root==null)
            return 0;
        traverse(root,depth);
        return depth+1;
    }
}
/*
Q104 Maximum Depth of Binary Tree

Given the root of a binary tree, return its maximum depth.

A binary tree's maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.

 

Example 1:


Input: root = [3,9,20,null,null,15,7]
Output: 3
Example 2:

Input: root = [1,null,2]
Output: 2
 

Constraints:

The number of nodes in the tree is in the range [0, 104].
-100 <= Node.val <= 100
*/
/*
Runtime
Details
0ms
Beats 100.00%of users with Java

Memory
Details
41.69MB
Beats 29.93%of users with Java
*/