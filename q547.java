class q547 {
    public void dfs(int node, int[][] isConnected, boolean visit[]) {
        visit[node] = true;
        for (int i = 0; i < isConnected[node].length; i++) {
            if (isConnected[node][i] == 1 && !visit[i])// visit that node
                dfs(i, isConnected, visit);
        }
    }

    public int findCircleNum(int[][] isConnected) {
        int n = isConnected.length;
        boolean visit[] = new boolean[n];
        int count = 0;// number of connted components
        for (int i = 0; i < n; i++) {
            if (visit[i])
                continue;
            else {
                // We visit the node by dfs
                count++;
                dfs(i, isConnected, visit);
            }
        }
        return count;
    }
}
/*
 * 
 * Q547. Number of Provinces
 * 
 * There are n cities. Some of them are connected, while some are not. If city a
 * is connected directly with city b, and city b is connected directly with city
 * c, then city a is connected indirectly with city c.
 * 
 * A province is a group of directly or indirectly connected cities and no other
 * cities outside of the group.
 * 
 * You are given an n x n matrix isConnected where isConnected[i][j] = 1 if the
 * ith city and the jth city are directly connected, and isConnected[i][j] = 0
 * otherwise.
 * 
 * Return the total number of provinces.
 * 
 * 
 * 
 * Example 1:
 * 
 * 
 * Input: isConnected = [[1,1,0],[1,1,0],[0,0,1]]
 * Output: 2
 * Example 2:
 * 
 * 
 * Input: isConnected = [[1,0,0],[0,1,0],[0,0,1]]
 * Output: 3
 * 
 * 
 * Constraints:
 * 
 * 1 <= n <= 200
 * n == isConnected.length
 * n == isConnected[i].length
 * isConnected[i][j] is 1 or 0.
 * isConnected[i][i] == 1
 * isConnected[i][j] == isConnected[j][i]
 */
/*
 * Runtime
 * 1ms Beats 94.89% of users with Java
 * 
 * Memory
 * 47.84MB Beats 18.60% of users with Java
 */