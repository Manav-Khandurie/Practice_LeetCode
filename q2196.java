import java.util.HashMap;
import java.util.Map;

public class q2196 {
    public TreeNode findIfPresent(HashMap<Integer, TreeNode> hm1, HashMap<Integer, TreeNode> hm2, int target) {
        TreeNode ans = new TreeNode();
        if (hm1.containsKey(target))
            return hm1.get(target);
        if (hm2.containsKey(target))
            return hm2.get(target);
        return ans;
    }

    public void printMap(HashMap<Integer, TreeNode> hm) {
        System.out.println(hm);
    }

    public TreeNode getRoot(HashMap<Integer, TreeNode> a, HashMap<Integer, TreeNode> b) {
        TreeNode ans = new TreeNode();
        // a-b
        for (Map.Entry<Integer, TreeNode> e : a.entrySet()) {

            // System.out.println("Key: " + e.getKey()+ " Value: " + e.getValue());
            if (!b.containsKey(e.getKey())) {
                ans = e.getValue();
                // System.out.println("here "+ans);
                return ans;
            }
        }
        return ans;
    }

    public TreeNode createBinaryTree(int[][] descriptions) {
        // Make 3 Hash Sets Parent Child All
        HashMap<Integer, TreeNode> parent = new HashMap<>();
        HashMap<Integer, TreeNode> child = new HashMap<>();
        // HashMap<Integer,TreeNode> all=new HashMap<>();
        int p, c, d;
        for (int arr[] : descriptions) {
            // Extract or create Child and Parent
            p = arr[0];
            c = arr[1];
            d = arr[2];
            TreeNode nparent = findIfPresent(parent, child, p);
            TreeNode nchild = findIfPresent(child, parent, c);
            nparent.val = p;
            nchild.val = c;
            if (d == 1)
                nparent.left = nchild;
            else
                nparent.right = nchild;
            parent.put(nparent.val, nparent);
            child.put(nchild.val, nchild);
            // all.push(nparent);
            // all.push(nchild);
        }
        // System.out.println(child);
        // System.out.println(parent);
        // System.out.println(all);
        // //parent - child
        // printSet(all);
        // printMap(child);
        // printMap(parent);
        // printSet(parent);
        // System.out.println(ans);

        return getRoot(parent, child);
    }
}
/*
 * 2196. Create Binary Tree From Descriptions
 * 
 * You are given a 2D integer array descriptions where descriptions[i] =
 * [parenti, childi, isLefti] indicates that parenti is the parent of childi in
 * a binary tree of unique values. Furthermore,
 * 
 * If isLefti == 1, then childi is the left child of parenti.
 * If isLefti == 0, then childi is the right child of parenti.
 * Construct the binary tree described by descriptions and return its root.
 * 
 * The test cases will be generated such that the binary tree is valid.
 */
/*
 * Runtime
 * 74ms
 * Beats 46.12% of users with Java
 * 
 * Memory
 * 56.24MB Beats 17.05% of users with Java
 */