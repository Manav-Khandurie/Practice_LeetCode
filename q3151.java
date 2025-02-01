class Solution {
    boolean isOdd(int x){
        return x%2!=0;
    }
    public boolean isArraySpecial(int[] nums) {
        int n=nums.length;
        for(int i=1;i<n;i++){
            if(isOdd(nums[i]) == !isOdd(nums[i-1]))
                continue;
            else
                return false;
        }
        return true;
    }
}