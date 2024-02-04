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

    class Pair<P, K> {
        public P depth;
        public K val;

        Pair() {

        }

        Pair(P p1, K k1) {
            depth = p1;
            val = k1;
        }

        public P getDepth() {
            return depth;
        }

        public K getVal() {
            return val;
        }

        public void setVal(K val) {
            this.val = val;
        }

        public void setDepth(P depth) {
            this.depth = depth;
        }
    }

    Pair<Integer, Integer> pair = new Pair<>(0, 0);

    public void dfs(TreeNode root, int depth) {
        if (root == null) {
            return;
        }
        if (pair.depth < depth) {
            pair.setVal(root.val);
            pair.setDepth(depth);
        }
        dfs(root.left, depth + 1);
        dfs(root.right, depth + 1);
    }

    public int findBottomLeftValue(TreeNode root) {
        pair.depth = 0;
        dfs(root, 1);//
        return pair.val;
    }
}
/*
 * 513. Find Bottom Left Tree Value
 * 
 * Given the root of a binary tree, return the leftmost value in the last row of
 * the tree.
 * 
 * 
 * 
 * Example 1:
 * 
 * 
 * Input: root = [2,1,3]
 * Output: 1
 * Example 2:
 * 
 * 
 * Input: root = [1,2,3,4,null,5,6,null,null,7]
 * Output: 7
 * 
 * 
 * Constraints:
 * 
 * The number of nodes in the tree is in the range [1, 104].
 * -231 <= Node.val <= 231 - 1
 */
/*
 * Runtime
 * 0ms Beats 100.00% of users with Java
 * 
 * Memory
 * 43.68MB Beats 70.55% of users with Java
 */