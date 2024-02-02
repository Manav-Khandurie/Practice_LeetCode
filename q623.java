import java.util.*;
class q623 {
    int target=0,val;
    public void dfs(TreeNode root,int depth){
        if(root==null)
            return;
        if(depth==target){
            TreeNode t1=root.left;
            TreeNode t2=root.right;
            root.left=new TreeNode(this.val,t1,null);
            root.right=new TreeNode(this.val,null,t2);
            return;
        }
        dfs(root.left,depth+1);
        dfs(root.right,depth+1);
    }
    public TreeNode addOneRow(TreeNode root, int val, int depth) {
        this.target=depth-1;
        this.val=val;
        if(depth==1){
            TreeNode ans=new TreeNode(val,root,null);
            return ans;
        }
        dfs(root,1);
        return root;
    }
}
/*
Q623. Add One Row to Tree

Given the root of a binary tree and two integers val and depth, add a row of nodes with value val at the given depth depth.

Note that the root node is at depth 1.

The adding rule is:

Given the integer depth, for each not null tree node cur at the depth depth - 1, create two tree nodes with value val as cur's left subtree root and right subtree root.
cur's original left subtree should be the left subtree of the new left subtree root.
cur's original right subtree should be the right subtree of the new right subtree root.
If depth == 1 that means there is no depth depth - 1 at all, then create a tree node with value val as the new root of the whole original tree, and the original tree is the new root's left subtree.
 

Example 1:


Input: root = [4,2,6,3,1,5], val = 1, depth = 2
Output: [4,1,1,2,null,null,6,3,1,5]
Example 2:


Input: root = [4,2,null,3,1], val = 1, depth = 3
Output: [4,2,null,1,1,3,null,null,1]
 

Constraints:

The number of nodes in the tree is in the range [1, 104].
The depth of the tree is in the range [1, 104].
-100 <= Node.val <= 100
-105 <= val <= 105
1 <= depth <= the depth of tree + 1
*/
/*
Runtime
0ms Beats 100.00% of users with Java

Memory
44.43MB Beats 30.35% of users with Java
*/