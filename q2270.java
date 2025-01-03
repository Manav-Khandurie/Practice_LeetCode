class q2270 {
    public int waysToSplitArray(int[] nums) {
        int n=nums.length;
        long rightsum=0,leftsum=0;
        int index=0;
        index=n-1;rightsum=leftsum=0l;
        for(int i=n-1;i>=0;i--){
            rightsum+=nums[i];
        }
        int answer=0;
        for(int i=0;i<n-1;i++){
            leftsum+=nums[i];
            rightsum-=nums[i];
            if(leftsum>=rightsum)
                answer++;
            
        }
        return answer;
    }
}