import java.util.*;

class q538 {

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

    SortedSet<Integer> ss = new TreeSet<>();

    public void traverseBST(TreeNode root) {
        if (root == null)
            return;
        ss.add(root.val);
        traverseBST(root.left);
        traverseBST(root.right);
    }

    public void updateBST(TreeNode root, Map<Integer, Integer> hm) {
        if (root == null)
            return;
        root.val = hm.get(root.val);
        updateBST(root.left, hm);
        updateBST(root.right, hm);
    }

    public TreeNode convertBST(TreeNode root) {
        traverseBST(root);
        System.out.println(ss);
        Object[] arr = ss.toArray();
        HashMap<Integer, Integer> hm = new HashMap<>();
        Integer sum = 0;
        for (int i = arr.length - 1; i >= 0; i--) {
            sum += (Integer) arr[i];
            hm.put((Integer) arr[i], sum);
        }
        updateBST(root, hm);

        return root;
    }
}
/*
 * Q538. Convert BST to Greater Tree
 * 
 * Given the root of a Binary Search Tree (BST), convert it to a Greater Tree
 * such that every key of the original BST is changed to the original key plus
 * the sum of all keys greater than the original key in BST.
 * 
 * As a reminder, a binary search tree is a tree that satisfies these
 * constraints:
 * 
 * The left subtree of a node contains only nodes with keys less than the node's
 * key.
 * The right subtree of a node contains only nodes with keys greater than the
 * node's key.
 * Both the left and right subtrees must also be binary search trees.
 * 
 * 
 * Example 1:
 * 
 * 
 * Input: root = [4,1,6,0,2,5,7,null,null,null,3,null,null,null,8]
 * Output: [30,36,21,36,35,26,15,null,null,null,33,null,null,null,8]
 * Example 2:
 * 
 * Input: root = [0,null,1]
 * Output: [1,null,1]
 * 
 * 
 * Constraints:
 * 
 * The number of nodes in the tree is in the range [0, 104].
 * -104 <= Node.val <= 104
 * All the values in the tree are unique.
 * root is guaranteed to be a valid binary search tree.
 * 
 * 
 * Note: This question is the same as 1038:
 * https://leetcode.com/problems/binary-search-tree-to-greater-sum-tree/
 */
/*
 * Runtime
 * 12ms Beats 5.13% of users with Java
 * 
 * Memory
 * 45.13MB Beats 37.01% of users with Java
 */