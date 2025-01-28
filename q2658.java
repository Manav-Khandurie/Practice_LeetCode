class q2658 {
    boolean isValid(int row,int col,int m,int n){
        return row<m && row>=0 && col<n && col>=0;
    }
    int dfs(int [][]grid,boolean [][]visits,int x,int y, int m,int n,int ans){
        visits[x][y]=true;
        ans+=grid[x][y];
        int dirs[][]={{-1,0},{+1,0},{0,+1},{0,-1}};
        for(int dir[] : dirs){
            int row=x+dir[0],col=y+dir[1];
            if(isValid(row,col,m,n) && !visits[row][col] && grid[row][col]!=0)
                ans=ans+dfs(grid,visits,row,col,m,n,0);
        }
        return ans;
    }
    public int findMaxFish(int[][] grid) {
        //USE DFS TO EXPLORE ALL PATHS
        int m=grid.length,n=grid[0].length,ans=0;
        boolean [][]visits=new boolean[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j] != 0 && !visits[i][j]){
                    int val=dfs(grid,visits,i,j,m,n,0);
                    // System.out.println(i+","+j+":"+val);
                    ans=Math.max(ans,val);
                }
            }
        }
        return ans;
    }
}