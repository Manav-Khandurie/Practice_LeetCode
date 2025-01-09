class q1926{

    boolean checkValid(int x , int limit){
        return x>=0 && x<limit;
    }
    boolean areSame(int []a,int []b){
        return a[0]==b[0] && a[1]==b[1];
    }
    public int nearestExit(char[][] maze, int[] entrance) {
        Queue<int[]> q=new LinkedList<>();
        int k=0,m=maze.length,n=maze[0].length;
        int nv[]={entrance[0],entrance[1],0};
        q.add(nv);
        boolean visit[][]=new boolean[m][n];
        int dir[][]={{-1,0},{+1,0},{0,+1},{0,-1}};
        visit[nv[0]][nv[1]]=true;
        while(!q.isEmpty()){
            int ele[]=q.poll();
            //System.out.println("~~~"+ele[0]+","+ele[1]+"~~~~"+ele[2]);
            for(int x[]: dir){
                int row=x[0]+ele[0],col=x[1]+ele[1];
                //System.out.println(checkValid(row,m) +" "+ checkValid(col,n)+"\t"+row+","+col +"\t"+areSame(ele,entrance));
                if(!checkValid(row,m) || !checkValid(col,n) ){
                    if(areSame(ele,entrance))
                        continue;
                    return ele[2];
                }
                else if( checkValid(row,m) && checkValid(col,n) && !visit[row][col] && maze[row][col]=='.'){
                    int nval[]={row,col,ele[2]+1};
                    q.offer(nval);
                    visit[nval[0]][nval[1]]=true;
                }
            }
            k++;
        }
        return -1;
    }
}