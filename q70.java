class q70 {
    
    public int climbStairs(int n) {
        int a=1,b=1,sum=0;
        n-=1;
        for(int i=1;i<=n;i++){
            sum=a;
            a=a+b;
            b=sum;
        }
        return Math.max(a,b);
    }
}
/*
Q70) Climbing Stairs 

You are climbing a staircase. It takes n steps to reach the top.

Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?

 

Example 1:

Input: n = 2
Output: 2
Explanation: There are two ways to climb to the top.
1. 1 step + 1 step
2. 2 steps
Example 2:

Input: n = 3
Output: 3
Explanation: There are three ways to climb to the top.
1. 1 step + 1 step + 1 step
2. 1 step + 2 steps
3. 2 steps + 1 step


Runtime
Details
0ms
Beats 100.00%of users with Java

Memory
Details
39.04MB
Beats 59.30%of users with Java
 */