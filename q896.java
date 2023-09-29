class q896 {
    public boolean isMonotonic(int[] nums) {
        int len=nums.length;
        if(len==1 || len==2)
            return true;
        
        boolean check=false;
        int pt1=0,pt2=1;
        while(pt2<len && nums[pt1]==nums[pt2]){
            pt1++;pt2++;
        }
        if(pt2>=len)
            return true;
        boolean inc=(nums[pt1]>nums[pt2])? false:true;
        for(; pt2<len;pt1++,pt2++){
            check=(nums[pt1]>nums[pt2])? false:true;
            if(check!=inc && nums[pt1]!=nums[pt2])
                return false;
        }
        return true;
    }
}