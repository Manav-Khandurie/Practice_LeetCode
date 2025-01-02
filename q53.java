class q53 {
    public int maxSubArray(int[] nums) {
        int max=nums[0],sum=0;
        for(int i=0;i<nums.length;i++){
            sum = Math.max(nums[i],nums[i]+sum);
            max=Math.max(sum,max);
        }
        return max;
    }
}