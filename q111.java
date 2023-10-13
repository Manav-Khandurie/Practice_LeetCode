class Solution {
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
    int depth=Integer.MAX_VALUE;
    public void rec(TreeNode root,int depth){
        if(root==null)
            return;
        if(depth>this.depth)
            return;
        if(root.left==null && root.right==null){
            //depth--;
            if(depth<this.depth)
                this.depth=depth;
            return;
        }
        rec(root.left,depth+1);
        rec(root.right,depth+1);
    }
    public int minDepth(TreeNode root) {
        if(root==null)
            return 0;
        rec(root,1);
        return depth;
    }
}
/*
Q111 Minimum Depth of Binary Tree

Given a binary tree, find its minimum depth.

The minimum depth is the number of nodes along the shortest path from the root node down to the nearest leaf node.

Note: A leaf is a node with no children.

 

Example 1:


Input: root = [3,9,20,null,null,15,7]
Output: 2
Example 2:

Input: root = [2,null,3,null,4,null,5,null,6]
Output: 5
 

Constraints:

The number of nodes in the tree is in the range [0, 105].
-1000 <= Node.val <= 1000

*/
/*
Runtime
Details
1ms
Beats 100.00%of users with Java

Memory
Details
61.85MB
Beats 67.90%of users with Java
*/