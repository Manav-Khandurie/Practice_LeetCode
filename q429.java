import java.util.*;

class q430 {
    class Node {
        public int val;
        public List<Node> children;

        public Node() {
        }

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, List<Node> _children) {
            val = _val;
            children = _children;
        }
    }

    public List<List<Integer>> levelOrder(Node root) {

        List<List<Integer>> lst = new ArrayList<>();
        Queue<Node> q = new LinkedList<>();
        q.offer(root);
        if (root == null)
            return lst;
        int ilter = 0;
        while (!q.isEmpty()) {
            ilter = q.size();
            List<Integer> ls = new ArrayList<>();
            while (ilter > 0) {
                ilter--;
                Node t = q.poll();
                for (Node x : t.children)
                    q.offer(x);
                ls.add(t.val);
            }
            lst.add(ls);
        }
        return lst;
    }
}
/*
 * Q429. N-ary Tree Level Order Traversal
 * 
 * Given an n-ary tree, return the level order traversal of its nodes' values.
 * 
 * Nary-Tree input serialization is represented in their level order traversal,
 * each group of children is separated by the null value (See examples).
 * 
 * 
 * 
 * Example 1:
 * 
 * 
 * 
 * Input: root = [1,null,3,2,4,null,5,6]
 * Output: [[1],[3,2,4],[5,6]]
 * Example 2:
 * 
 * 
 * 
 * Input: root =
 * [1,null,2,3,4,5,null,null,6,7,null,8,null,9,10,null,null,11,null,12,null,13,
 * null,null,14]
 * Output: [[1],[2,3,4,5],[6,7,8,9,10],[11,12,13],[14]]
 * 
 * 
 * Constraints:
 * 
 * The height of the n-ary tree is less than or equal to 1000
 * The total number of nodes is between [0, 104]
 */
/*
 * Runtime
 * 3ms Beats 79.31% of users with Java
 * 
 * Memory
 * 44.96MB Beats 18.25% of users with Java
 */