import java.util.*;
class q802 {

    HashMap<Integer,Boolean> hm=new HashMap<>();

    public boolean dfs(int[][] graph,int i){
        if(hm.containsKey(i))
            return hm.get(i);
        //Assume that the node is unsafe so that we detect cycles
        hm.put(i,false);
        boolean ans=true;
        for(int j=0;j<graph[i].length;j++){
            if(!dfs(graph,graph[i][j]))
                return false;
        }
        //System.out.println(i+","+ans);
        hm.put(i,ans);
        return ans;
    }
    public List<Integer> eventualSafeNodes(int[][] graph) {
        List<Integer> ans=new ArrayList<>();
        for(int i=0;i<graph.length;i++){
            if(dfs(graph,i))
                ans.add(i);
        }
        System.out.println(hm);
        Collections.sort(ans);
        System.out.println(ans);
        return ans;
    }
}

/*
class Solution {

    public boolean isTerminal(int[][] graph,int node){
        //System.out.println("\n"+(graph[node].length)+"\\\\"+node);
        return (graph[node].length == 0);
    }
    public boolean isSafe(int[][] graph,int node,boolean visit[],boolean safe[]){
        if(!visit[node])
            dfs(graph,node,visit,safe);
        System.out.println(isTerminal(graph,node)+"///"+safe[node]);
        boolean ans= isTerminal(graph,node) || safe[node];
        return ans;
    }
    public void dfs(int[][] graph,int node,boolean visit[],boolean safe[]){
        visit[node]=true;
        boolean ans=true;
        for(int x=0;x<graph[node].length;x++){
            if(!visit[x]){
                boolean t=isSafe(graph,graph[node][x],visit,safe);
                System.out.println("~~~"+t);
                ans = ans && t;
                //safe[x]=t;
            }
        }
        safe[node]=ans;
    }
    public List<Integer> eventualSafeNodes(int[][] graph) {
        
        boolean visit[]=new boolean[graph.length];
        boolean safe[]=new boolean[graph.length];
        //print(safe);
        for(int i=0;i<graph.length;i++){
            if(!visit[i]){
               // dfs(graph,i,visit,safe);
               System.out.println(isSafe(graph,i,visit,safe));
            }
        }
        print(safe);
        return null;
    }
    public void print(boolean safe[]){
        System.out.println();
        for(boolean x : safe)
            System.out.print(x+",");
    }
}
*/