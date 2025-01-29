class q684 {
    class UnionFind{
        int parent[];
        UnionFind(int n){
            parent=new int[n+1];
            Arrays.fill(parent,-1);
        }
        int find(int x){
            if(parent[x] < 0){
                return x;
            }
            parent[x]=find(parent[x]);// collapse find
            return parent[x];
        }
        void union(int x , int y){
            //S-1) Find x and Find y
            int rootX=find(x),rootY=find(y);

            //S-2) If unequal we go fowward and union them
            if(rootX != rootY){
                if(parent[rootX] < parent[rootY]){
                    // absx > absy so parent[x]= - * sum(absx+absy)
                    parent[rootX]= -1 * (Math.abs(parent[rootX]) + Math.abs(parent[rootY]));
                    parent[rootY]= rootX;
                }else{
                    // absy > absx so parent[y]= - * sum(absx+absy)
                    parent[rootY]= -1 * (Math.abs(parent[rootX]) + Math.abs(parent[rootY]));
                    parent[rootX]= rootY;
                }
            }
        }
    }
    public int[] findRedundantConnection(int[][] edges) {
        int n=edges.length;
        UnionFind uf=new UnionFind(n);
        int ans[]=edges[0];

        for(int x[] : edges){
            int rootX=uf.find(x[0]);
            int rootY=uf.find(x[1]);
            if(rootX==rootY){
                //Cycle 
                ans[0]=x[0];
                ans[1]=x[1];
                continue;
            }
            uf.union(x[0],x[1]);
        }
        return ans;
    }
}