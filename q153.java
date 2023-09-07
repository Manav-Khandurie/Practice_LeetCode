class Solution {
    public int findMin(int[] nums) {
        // int min=nums[0];

        // for(int i=1;i<nums.length;i++){
        //     if(nums[i]<min)
        //         min=nums[i];
        // }
        // return min;

        //first we find pivot

        // we find that by comparing the first and last ele
        // [4,5,6,7,0,1,2]
        //  i     j         --true
        // pivot a[j+1] that is min

        int i=0,j=nums.length-1;

        while(nums[i]>nums[j]){
            j=j-1;
        }

        //[0,1,2,4,5,6,7]
        // i            j
        if(j== nums.length-1)
            return nums[i];
        return nums[j+1];
    }
}


/***


public int findMin(int[] nums) {
        int low = 0, high = nums.length - 1, ans = Integer.MAX_VALUE;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (nums[low] <= nums[mid]) {
                ans = Math.min(ans, nums[low]);
                low = mid + 1;
            } else {
                ans = Math.min(ans, nums[mid]);
                high = mid - 1;
            }
        }
        return ans;
    }

[4,5,6,7,0,1,2]         l=0,h=7
 l           h 

 (l<=h) ==> true ==> mid(0+7)/2 ==> m=3
 [4,5,6,7,0,1,2]         l=0,h=7
  l     m     h 
nums[low]<=nums[m]  ====> 4 <=7 true <==> low get updated now we take the array [0,1,2]



 */

 /***
  * Suppose an array of length n sorted in ascending order is rotated between 1 and n times. For example, the array nums = [0,1,2,4,5,6,7] might become:

[4,5,6,7,0,1,2] if it was rotated 4 times.
[0,1,2,4,5,6,7] if it was rotated 7 times.
Notice that rotating an array [a[0], a[1], a[2], ..., a[n-1]] 1 time results in the array [a[n-1], a[0], a[1], a[2], ..., a[n-2]].

Given the sorted rotated array nums of unique elements, return the minimum element of this array.

You must write an algorithm that runs in O(log n) time.

 

Example 1:

Input: nums = [3,4,5,1,2]
Output: 1
Explanation: The original array was [1,2,3,4,5] rotated 3 times.
Example 2:

Input: nums = [4,5,6,7,0,1,2]
Output: 0
Explanation: The original array was [0,1,2,4,5,6,7] and it was rotated 4 times.
  */