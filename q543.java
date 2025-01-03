class q543 {
    private class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
    }
    int ans=0;
    int getHeight(TreeNode root){
        if(root==null)
            return 0;
        int left=getHeight(root.left);
        int right=getHeight(root.right);
        ans=Math.max(ans,left+right);
        return Math.max(left,right)+1;
    }
    public int diameterOfBinaryTree(TreeNode root) {
        getHeight(root);
        return ans;
    }
}