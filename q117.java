/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}
    
    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/

class q117 {
    class Node {
        public int val;
        public Node left;
        public Node right;
        public Node next;

        public Node() {
        }

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, Node _left, Node _right, Node _next) {
            val = _val;
            left = _left;
            right = _right;
            next = _next;
        }
    };

    public Node getNextNode(Node root, boolean isRight) {
        if (root == null)
            return root;
        Node ans = null;
        if (root.right != null && !isRight)
            ans = root.right;
        else if (root.next == null)
            ans = null;
        else if (root.next.left != null)
            ans = root.next.left;
        else if (root.next.right != null)
            ans = root.next.right;
        if (ans == null && root.next != null && root.next.next != null)
            ans = getNextNode(root.next, isRight);
        return ans;
    }

    public void dfs(Node root) {
        if (root == null)
            return;
        if (root.left != null)
            root.left.next = getNextNode(root, false);
        if (root.right != null)
            root.right.next = getNextNode(root, true);
        dfs(root.right);
        dfs(root.left);
    }

    public Node connect(Node root) {
        dfs(root);
        return root;
    }
}
// [1,2,3,4,5,null,6,7,null,null,null,null,8]

/*
 * 117. Populating Next Right Pointers in Each Node II
 * 
 * Given a binary tree
 * 
 * struct Node {
 * int val;
 * Node *left;
 * Node *right;
 * Node *next;
 * }
 * Populate each next pointer to point to its next right node. If there is no
 * next right node, the next pointer should be set to NULL.
 * 
 * Initially, all next pointers are set to NULL.
 * 
 * 
 * 
 * Example 1:
 * 
 * 
 * Input: root = [1,2,3,4,5,null,7]
 * Output: [1,#,2,3,#,4,5,7,#]
 * Explanation: Given the above binary tree (Figure A), your function should
 * populate each next pointer to point to its next right node, just like in
 * Figure B. The serialized output is in level order as connected by the next
 * pointers, with '#' signifying the end of each level.
 * Example 2:
 * 
 * Input: root = []
 * Output: []
 * 
 * 
 * Constraints:
 * 
 * The number of nodes in the tree is in the range [0, 6000].
 * -100 <= Node.val <= 100
 * 
 * 
 * Follow-up:
 * 
 * You may only use constant extra space.
 * The recursive approach is fine. You may assume implicit stack space does not
 * count as extra space for this problem.
 */
/*
 * Runtime
 * 0ms Beats 100.00% of users with Java
 * 
 * Memory
 * 43.84MB Beats 44.34% of users with Java
 */