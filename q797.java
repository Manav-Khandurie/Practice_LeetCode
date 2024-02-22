import java.util.*;
class q797 {
    List<List<Integer>> lst=new ArrayList<>();

    void backtrack(List<Integer> ans, int[][]graph,int target,int start){
        //System.out.println(ans+" "+start+" "+target+"||"+graph[start].length);
        if(start==target){
            //ans.add(target);
            lst.add(ans);
            return;
        }
        for(int i=0;i<graph[start].length;i++){
            List<Integer> ans1=new ArrayList<>(ans);
            //System.out.println(graph[start][i]);
            ans1.add(graph[start][i]);
            backtrack(ans1,graph,target,graph[start][i]);
            //ans.remove(graph[start][i]);
        }
    }
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        int n=graph.length-1;
        List<Integer> ls=new ArrayList<>();
        ls.add(0);
        backtrack(ls,graph,n,0);
        System.gc();
        return lst;
    }
}
/*
Q797. All Paths From Source to Target

Given a directed acyclic graph (DAG) of n nodes labeled from 0 to n - 1, find all possible paths from node 0 to node n - 1 and return them in any order.

The graph is given as follows: graph[i] is a list of all nodes you can visit from node i (i.e., there is a directed edge from node i to node graph[i][j]).

 

Example 1:


Input: graph = [[1,2],[3],[3],[]]
Output: [[0,1,3],[0,2,3]]
Explanation: There are two paths: 0 -> 1 -> 3 and 0 -> 2 -> 3.
Example 2:


Input: graph = [[4,3,1],[3,2,4],[3],[4],[]]
Output: [[0,4],[0,3,4],[0,1,3,4],[0,1,2,3,4],[0,1,4]]
 

Constraints:

n == graph.length
2 <= n <= 15
0 <= graph[i][j] < n
graph[i][j] != i (i.e., there will be no self-loops).
All the elements of graph[i] are unique.
The input graph is guaranteed to be a DAG.
*/
/*
Runtime
2ms Beats 81.57% of users with Java

Memory
46.48MB Beats 32.76% of users with Java
*/