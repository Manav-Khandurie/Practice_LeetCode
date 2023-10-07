import java.util.Stack;

class q121 {
    public int maxProfit(int[] arr) {
        // Maintain a monotonic inc stack
        int n=arr.length,j=n-1;
        Stack<Integer> stk=new Stack<>();
        int max=0,temp=0;
        stk.add(arr[j]);
        for(j=n-1;j>=0;j--){
            temp=stk.peek()-arr[j];
            if(temp>max)
                max=temp;
            if(arr[j]>stk.peek()){
                stk.add(arr[j]);
            }
        }
        return max;
        
    }
}
/*
Q121 Best Time to Buy and Sell Stock

You are given an array prices where prices[i] is the price of a given stock on the ith day.

You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.

Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.

 

Example 1:

Input: prices = [7,1,5,3,6,4]
Output: 5
Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
Note that buying on day 2 and selling on day 1 is not allowed because you must buy before you sell.
Example 2:

Input: prices = [7,6,4,3,1]
Output: 0
Explanation: In this case, no transactions are done and the max profit = 0.

 */
/*
Runtime
Details
22ms
Beats 10.02%of users with Java

Memory
Details
60.51MB
Beats 83.33%of users with Java
 */