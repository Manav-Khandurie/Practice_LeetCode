import java.util.*;

class q103 {
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

    List<List<Integer>> lst = new ArrayList<>();

    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        // Queue<Integer> q1=new LinkedList<>();
        if (root == null)
            return lst;
        int alter = 0;
        q.offer(root);
        // q1.offer(root.val);
        while (!q.isEmpty()) {
            List<Integer> ls = new LinkedList<>();
            // TreeNode t=q.poll();
            Queue<TreeNode> q1 = new LinkedList<>(q);// Copy of q
            // System.out.println(q1);
            while (!q1.isEmpty()) {
                TreeNode t = q.poll();
                q1.poll();
                ls.add(t.val);
                if (t.left != null)
                    q.offer(t.left);
                if (t.right != null)
                    q.offer(t.right);
            }
            // System.out.println("~~~"+ls);
            if (alter % 2 != 0)// rev
                Collections.reverse(ls);
            lst.add(ls);
            alter++;
        }
        return lst;
    }
}
/*
 * Q103. Binary Tree Zigzag Level Order Traversal
 * 
 * Given the root of a binary tree, return the zigzag level order traversal of
 * its nodes' values. (i.e., from left to right, then right to left for the next
 * level and alternate between).
 * 
 * 
 * 
 * Example 1:
 * 
 * 
 * Input: root = [3,9,20,null,null,15,7]
 * Output: [[3],[20,9],[15,7]]
 * Example 2:
 * 
 * Input: root = [1]
 * Output: [[1]]
 * Example 3:
 * 
 * Input: root = []
 * Output: []
 * 
 * 
 * Constraints:
 * 
 * The number of nodes in the tree is in the range [0, 2000].
 * -100 <= Node.val <= 100
 */
/*
 * Runtime
 * 1ms Beats 83.22% of users with Java
 * 
 * Memory
 * 42.32MB Beats 11.74% of users with Java
 */