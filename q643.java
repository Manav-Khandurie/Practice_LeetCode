class q643 {
    public double findMaxAverage(int[] nums, int k) {
        // First we create a sliding window of size k
        int i=0,j=0,n=nums.length;double sum=0.0;
        for(i=0;i<k;i++){
            sum+=nums[i];
        }
        //System.out.println(sum);
        double max=sum;
        for(j=i;j<n;j++){
            sum+=nums[j];
            sum-=nums[j-i];

            if(sum>max)
                max=sum;
        }
        return max/k;
    }
}