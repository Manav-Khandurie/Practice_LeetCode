import java.util.*;
class q1765 {
    boolean isValid(int x , int m){
        return x>=0 && x<m;
    }
    
    public int[][] highestPeak(int[][] mat) {
        int m=mat.length,n=mat[0].length;
        int dp[][]=new int[m][n];
        boolean [][]visit=new boolean[m][n];
        Queue<int[]> q=new LinkedList<>();
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++)
                if(mat[i][j]==1){
                    dp[i][j]=0;
                    q.offer(new int[]{i,j});
                    visit[i][j]=true;
                }else
                    dp[i][j]=(int)1e9;
        }
        int dir[][]={{-1,0},{+1,0},{0,+1},{0,-1}};
        while(!q.isEmpty()){
            int curr[]=q.poll();
            int x=curr[0],y=curr[1];
            for(int z[] : dir){
                int row=z[0]+x,col=z[1]+y;
                if(isValid(row,m) && isValid(col,n) && !visit[row][col]){
                    dp[row][col]=dp[x][y]+1;
                    q.offer(new int[]{row,col});
                    visit[row][col]=true;
                }
            }
        }
        return dp;
    }
}