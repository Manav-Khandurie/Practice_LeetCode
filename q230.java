class q230 {
    int latest = 0, k = 0;
    boolean switching = true;

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

    public void inorder(TreeNode root) {
        if (root == null)
            return;
        inorder(root.left);
        if (visit(root))
            return;
        inorder(root.right);
    }

    public boolean visit(TreeNode root) {
        if (switching) {
            latest = root.val;
            k--;
            if (k <= 0)
                switching = false;
            return (k > 0) ? false : true;
        } else
            return !switching;
    }

    public int kthSmallest(TreeNode root, int k) {
        this.k = k;

        inorder(root);
        return latest;
    }
}
/*
 * Q230. Kth Smallest Element in a BST
 * 
 * Given the root of a binary search tree, and an integer k, return the kth
 * smallest value (1-indexed) of all the values of the nodes in the tree.
 * 
 * 
 * 
 * Example 1:
 * 
 * 
 * Input: root = [3,1,4,null,2], k = 1
 * Output: 1
 * Example 2:
 * 
 * 
 * Input: root = [5,3,6,2,4,null,null,1], k = 3
 * Output: 3
 * 
 * 
 * Constraints:
 * 
 * The number of nodes in the tree is n.
 * 1 <= k <= n <= 104
 * 0 <= Node.val <= 104
 */
/*
 * 
 * Runtime
 * 0ms Beats 100.00% of users with Java
 * 
 * Memory
 * 44.25MB Beats 63.74% of users with Java
 */