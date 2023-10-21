import java.util.ArrayList;
import java.util.List;

class q54 {
    private boolean check(int s1,int s2){
        System.out.println(((s1)==s2)? true:false);
        return ((s1)==s2)? true:false;
    }
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> ls=new ArrayList<Integer>();
        int r2=matrix.length-1,r1=0,c2=matrix[0].length-1,c1=0,i=0,j=0,sz=(r2+1)*(1+c2);
        h:while(r1<=r2 && c1<=c2){
            System.out.println("c1:"+c1+"\tc2:"+c2);
            for(i=c1;i<=c2;i++)
                ls.add(matrix[r1][i]);
            r1++;
            if(check(ls.size(),sz))
                break h;
            System.out.println("r1:"+r1+"\tr2:"+r2);
            for(j=r1;j<=r2;j++)
                ls.add(matrix[j][c2]);
            c2--;
            if(check(ls.size(),sz))
                break h;
            System.out.println("c2:"+c2+"\tc1:"+c1);
            for(i=c2;i>=c1;i--)
                ls.add(matrix[r2][i]);
            r2--;
            if(check(ls.size(),sz))
                break h;
             System.out.println("r2:"+r2+"\tr1:"+r1);
            for(j=r2;j>=r1;j--)
                ls.add(matrix[j][c1]);
            c1++;
            if(check(ls.size(),sz))
                break h;
            System.out.println("r1:"+r1+"\tr2:"+r1+"\tc1:"+c1+"\tc2:"+c2);
        }
        return ls;
    }
}
/*
Q54 Spiral Matrix

Given an m x n matrix, return all elements of the matrix in spiral order.

 

Example 1:


Input: matrix = [[1,2,3],[4,5,6],[7,8,9]]
Output: [1,2,3,6,9,8,7,4,5]
Example 2:


Input: matrix = [[1,2,3,4],[5,6,7,8],[9,10,11,12]]
Output: [1,2,3,4,8,12,11,10,9,5,6,7]
 

Constraints:

m == matrix.length
n == matrix[i].length
1 <= m, n <= 10
-100 <= matrix[i][j] <= 100
*/
/*
Java
Runtime
13 ms
Beats
5.2%

Memory
41.7 MB
Beats
9.77%
*/