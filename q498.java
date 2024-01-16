import java.util.*;
class q498 {
    int m=0,n=0;
    public boolean check(int k,int t){
        return (k<m && t<n && k>=0 && t>=0);
    }
    public int[] findDiagonalOrder(int[][] arr) {
        int m=arr.length,n=arr[0].length;
        this.m=m;this.n=n;
        ArrayList<Integer> al;
        int ans[]=new int[m*n];
        int i=0,alter=0,ptr=0;
        for(i=0;i<n;i++){
            al=new ArrayList<>();
            int t=i;
            if(alter%2==0){
                //add first
                int k=0;
                while(check(k,t)){
                    al.addFirst(arr[k][t]);
                    k++;t--;
                }
            }else{
                int k=i;t=0; //1,0
                while(check(t,k)){
                    al.addLast(arr[t][k]);
                    k--;t++;
                }
            }
            //System.out.println(al);
            for(int x : al)
                ans[ptr++]=x;
            alter++;
        }


        for(i=1;i<m;i++,alter++){
            al=new ArrayList<>();
            int t=i;
            if(alter%2==0){
                //add first
                int k=n-1;
                while(check(t,k)){
                    al.addFirst(arr[t][k]);
                    k--;t++;
                }
            }else{
                int k=n-1;t=i; //1,0
                while(check(t,k)){
                    al.addLast(arr[t][k]);
                    t++;k--;
                }
            }
            //System.out.println(al);
            for(int x : al)
                ans[ptr++]=x;
        }

        return ans;
    }
}
/*
Q498. Diagonal Traverse

Given an m x n matrix mat, return an array of all the elements of the array in a diagonal order.

 

Example 1:


Input: mat = [[1,2,3],[4,5,6],[7,8,9]]
Output: [1,2,4,7,5,3,6,8,9]
Example 2:

Input: mat = [[1,2],[3,4]]
Output: [1,2,3,4]
 

Constraints:

m == mat.length
n == mat[i].length
1 <= m, n <= 104
1 <= m * n <= 104
-105 <= mat[i][j] <= 105
*/
/*
Runtime
8ms Beats 26.60% of users with Java

Memory
47.92MB Beats 5.46% of users with Java
*/