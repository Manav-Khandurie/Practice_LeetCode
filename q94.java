/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
import java.util.*;
class q94 {
    public void inorder(TreeNode n,List<Integer> ls){
        if(n==null)
            return;
        inorder(n.left,ls);
        ls.add(n.val);
        inorder(n.right,ls);
    }
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> ls=new ArrayList<Integer>();
        if(root!=null)
            inorder(root,ls);
        return ls;
    }
}