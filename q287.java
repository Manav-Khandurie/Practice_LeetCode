class q287 {
    public int findDuplicate(int[] nums) {
        int turtle=nums[0],hare=nums[0];
        while(true){
            turtle=nums[turtle];
            hare=nums[nums[hare]];
            if(turtle==hare){
                break;
            }
        }
        int ptr1=nums[0],ptr2=turtle;
        while(ptr1!=ptr2){
            ptr1=nums[ptr1];
            ptr2=nums[ptr2];
        }
        return ptr2;
    }
}