import java.util.*;

class q2385 {
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

    Map<Integer, List<Integer>> graph = new HashMap<>();

    public void createGraph(TreeNode root) {
        if (root == null)
            return;
        List<Integer> lst = graph.getOrDefault(root.val, new ArrayList<>());
        List<Integer> ls = new ArrayList<>();
        ls.add(root.val);
        List<Integer> ls1 = new ArrayList<>(ls);
        if (root.right != null) {
            lst.add(root.right.val);
            graph.put(root.right.val, ls);
        }
        if (root.left != null) {
            lst.add(root.left.val);
            graph.put(root.left.val, ls1);
        }
        graph.put(root.val, lst);
        createGraph(root.left);
        createGraph(root.right);
    }

    public int amountOfTime(TreeNode root, int start) {
        createGraph(root);
        // System.out.println(graph);

        int minute = -1;
        List<Integer> lst;
        Queue<Integer> q = new LinkedList<>();
        Set<Integer> seen = new HashSet<>();
        q.add(start);
        while (!q.isEmpty()) {
            int ilter = q.size();
            while (ilter-- > 0) {
                int ele = q.poll();
                lst = graph.get(ele);
                for (Integer x : lst) {
                    if (!seen.contains(x))
                        q.offer(x);
                }
                seen.add(ele);
            }
            minute++;
        }
        return minute;
    }
}
/*
 * Q2385. Amount of Time for Binary Tree to Be Infected
 * 
 * You are given the root of a binary tree with unique values, and an integer
 * start. At minute 0, an infection starts from the node with value start.
 * 
 * Each minute, a node becomes infected if:
 * 
 * The node is currently uninfected.
 * The node is adjacent to an infected node.
 * Return the number of minutes needed for the entire tree to be infected.
 * 
 * 
 * 
 * Example 1:
 * 
 * 
 * Input: root = [1,5,3,null,4,10,6,9,2], start = 3
 * Output: 4
 * Explanation: The following nodes are infected during:
 * - Minute 0: Node 3
 * - Minute 1: Nodes 1, 10 and 6
 * - Minute 2: Node 5
 * - Minute 3: Node 4
 * - Minute 4: Nodes 9 and 2
 * It takes 4 minutes for the whole tree to be infected so we return 4.
 * Example 2:
 * 
 * 
 * Input: root = [1], start = 1
 * Output: 0
 * Explanation: At minute 0, the only node in the tree is infected so we return
 * 0.
 * 
 * 
 * Constraints:
 * 
 * The number of nodes in the tree is in the range [1, 105].
 * 1 <= Node.val <= 105
 * Each node has a unique value.
 * A node with a value of start exists in the tree.
 */
/*
 * Runtime
 * 141ms Beats 29.38% of users with Java
 * 
 * Memory
 * 102.85MB Beats 53.14% of users with Java
 */