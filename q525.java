class q525 {
    public int findMaxLength(int[] nums) {
        int n=nums.length,sum=0;
        int max=0;
        Map<Integer,Integer> map=new HashMap<>();
        // <Sum,Index>

        map.put(0,-1);
        for(int i=0;i<n;i++){
            sum += (nums[i]==1)? 1:-1;
            if(map.containsKey(sum))
                max=Math.max( max , Math.abs( i-map.get(sum) ) );
            else
                map.put(sum,i);
        }
        return max;
    }
}