class q905 {
    public int[] sortArrayByParity(int[] nums) {
        
        int i=0,j=nums.length-1,len=nums.length,t;
        while(i<j && (i<len && j<len)){
            while(j>=0 && nums[j]%2!=0){
                //move j till we find even no.
                j--;
            }
            while(i<len && nums[i]%2==0){
                //move i till we find odd no.
                i++;
            }
            //breaking condition check
            if(i>=len || j<0 || i>j)
                break;
            //swap nums[i] and nums[j] unless i<j
            t=nums[i];
            nums[i]=nums[j];
            nums[j]=t;
            i++;j--;
        }
        return nums;
    }
}