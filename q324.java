class q324 {
    public boolean isPowerOfFour(int n) {
        if(n==1)
            return true;
        if(n<=0)
            return false;
        double x=Math.log(n)/Math.log(4);
        return (x%1==0.0);
    }
}
/*
Q342 Power of Four

Given an integer n, return true if it is a power of four. Otherwise, return false.

An integer n is a power of four, if there exists an integer x such that n == 4x.

 

Example 1:

Input: n = 16
Output: true
Example 2:

Input: n = 5
Output: false
Example 3:

Input: n = 1
Output: true
 

Constraints:

-231 <= n <= 231 - 1
 

Follow up: Could you solve it without loops/recursion?
*/
/*
Runtime
Details
1ms
Beats 76.18%of users with Java

Memory
Details
39.17MB
Beats 91.68%of users with Java*/