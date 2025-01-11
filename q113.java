class q113 {
    class Node {
        public int val;
        public List<Node> neighbors;
        public Node() {
            val = 0;
            neighbors = new ArrayList<Node>();
        }
        public Node(int _val) {
            val = _val;
            neighbors = new ArrayList<Node>();
        }
        public Node(int _val, ArrayList<Node> _neighbors) {
            val = _val;
            neighbors = _neighbors;
        }
    }
    Node visited[];
    Node dfs(Node n){
        if(visited[n.val]!=null)
            return visited[n.val];
        visited[n.val] = new Node(n.val);
        for(Node x : n.neighbors){
            visited[n.val].neighbors.add(dfs(x));
        }
        return visited[n.val];
    }
    public Node cloneGraph(Node node) {
        if(node == null)
            return null;
        visited = new Node[101];
        return dfs(node);
    }
}