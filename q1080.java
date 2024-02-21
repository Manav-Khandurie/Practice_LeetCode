import java.util.*;

class Solution {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    int limit = 0;

    boolean isSufficient(TreeNode root, int sum) {
        if (root == null)
            return false;
        if (root.left == null && root.right == null && root.val + sum >= limit)
            return true;
        if (root.left == null && root.right == null && root.val + sum < limit)
            return false;

        boolean left = isSufficient(root.left, sum + root.val);
        boolean right = isSufficient(root.right, sum + root.val);
        // System.out.println(root.val+" "+left+" "+right);
        if (!left && root.left != null)
            root.left = null;

        if (!right && root.right != null)
            root.right = null;

        return (left || right);
    }

    public TreeNode sufficientSubset(TreeNode root, int limit) {
        this.limit = limit;

        boolean ans = isSufficient(root, 0);
        if (!ans)
            return null;
        return root;
    }
}
/*
 * Q1080. Insufficient Nodes in Root to Leaf Paths
 * 
 * Given the root of a binary tree and an integer limit, delete all insufficient
 * nodes in the tree simultaneously, and return the root of the resulting binary
 * tree.
 * 
 * A node is insufficient if every root to leaf path intersecting this node has
 * a sum strictly less than limit.
 * 
 * A leaf is a node with no children.
 * 
 * 
 * 
 * Example 1:
 * 
 * 
 * Input: root = [1,2,3,4,-99,-99,7,8,9,-99,-99,12,13,-99,14], limit = 1
 * Output: [1,2,3,4,null,null,7,8,9,null,14]
 * Example 2:
 * 
 * 
 * Input: root = [5,4,8,11,null,17,4,7,1,null,null,5,3], limit = 22
 * Output: [5,4,8,11,null,17,4,7,null,null,null,5]
 * Example 3:
 * 
 * 
 * Input: root = [1,2,-3,-5,null,4,null], limit = -1
 * Output: [1,null,-3,4]
 * 
 * 
 * Constraints:
 * 
 * The number of nodes in the tree is in the range [1, 5000].
 * -105 <= Node.val <= 105
 * -109 <= limit <= 109
 */
/*
 * Runtime
 * 0ms Beats 100.00% of users with Java
 * 
 * Memory
 * 44.75MB Beats 70.64% of users with Java
 */