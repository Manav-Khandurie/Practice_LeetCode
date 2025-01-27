class q419 {
    boolean isValid(int x,int y,int m,int n){
        return x>=0 && y>=0 && x<m && y<n ;
    }
    void dfs(boolean visits[][],char [][]board,int x,int y,int m ,int n){
        visits[x][y]=true;
        int [][]dirs ={{+1,0},{-1,0},{0,+1},{0,-1}};
        for(int []dir : dirs){
            int row=dir[0]+x,col=dir[1]+y;
            if(isValid(row,col,m,n) && !visits[row][col] && board[row][col]=='X')
                dfs(visits,board,row,col,m,n);
        }
    }
    public int countBattleships(char[][] board) {
        // WE USE DFS
        int m=board.length,n=board[0].length,ans=0;
        boolean visits[][]=new boolean[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(board[i][j]=='X' && !visits[i][j]){
                    // VISIT the NODE
                    dfs(visits,board,i,j,m,n);
                    ans++;
                }
            }
        }
        return ans;
    }
}