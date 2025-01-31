class q121 {
    public int maxProfit(int[] prices) {
        int n=prices.length;
        int prefix[]=new int[n];
        int max=prices[n-1];
        for(int i=n-1;i>=0;i--){
            prefix[i]=Math.max(max,prices[i]);
            max=Math.max(prices[i],max);
        }
        int ans=0;
        for(int i=0;i<n-1;i++){
            ans=Math.max(ans,prefix[i+1]-prices[i]);
        }
        return ans;
    }
}
/***
[7,1,5,3,6,4]
[7,6,6,6,6,4]
 */