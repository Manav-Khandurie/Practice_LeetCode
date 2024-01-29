class q437 {

    int c = 0;
    int target = 0;

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

    public void dfs(TreeNode root, long sum) {
        if (root == null)
            return;
        sum += root.val;
        // System.out.println(root.val+","+sum);
        if (sum == target)
            c++;
        dfs(root.left, sum);
        dfs(root.right, sum);

    }

    public void pathsumstart(TreeNode root) {
        // System.out.println();
        if (root == null)
            return;
        dfs(root, 0l);
        pathsumstart(root.right);
        pathsumstart(root.left);
    }

    public int pathSum(TreeNode root, int targetSum) {
        this.target = targetSum;
        if (root == null)
            return c;
        pathsumstart(root);
        return c;
    }
}
/*
 * Q437. Path Sum III
 * 
 * Given the root of a binary tree and an integer targetSum, return the number
 * of paths where the sum of the values along the path equals targetSum.
 * 
 * The path does not need to start or end at the root or a leaf, but it must go
 * downwards (i.e., traveling only from parent nodes to child nodes).
 * 
 * 
 * 
 * Example 1:
 * 
 * 
 * Input: root = [10,5,-3,3,2,null,11,3,-2,null,1], targetSum = 8
 * Output: 3
 * Explanation: The paths that sum to 8 are shown.
 * Example 2:
 * 
 * Input: root = [5,4,8,11,null,13,4,7,2,null,null,5,1], targetSum = 22
 * Output: 3
 * 
 * 
 * Constraints:
 * 
 * The number of nodes in the tree is in the range [0, 1000].
 * -109 <= Node.val <= 109
 * -1000 <= targetSum <= 1000
 */
/*
 * Runtime
 * 17ms Beats 42.32% of users with Java
 * 
 * Memory
 * 43.10MB Beats 83.48% of users with Java
 */