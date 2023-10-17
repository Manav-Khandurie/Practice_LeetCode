import java.util.HashSet;
import java.util.Set;

class q128 {
    public int longestConsecutive(int[] nums) {

        Set<Integer> set=new HashSet<>();
        for(int x : nums){
            set.add(x);
        }
        int longest=0,length=0;
        for(Integer i : nums){
            if(!set.contains(i-1)){
                //Start of seq
                length=0;
                while(set.contains(i+length))
                    length++;
                if(length>longest)
                    longest=length;
            }
        }
        return longest;
    }
}
/*
Q128 Longest Consecutive Sequence

Given an unsorted array of integers nums, return the length of the longest consecutive elements sequence.

You must write an algorithm that runs in O(n) time.

 

Example 1:

Input: nums = [100,4,200,1,3,2]
Output: 4
Explanation: The longest consecutive elements sequence is [1, 2, 3, 4]. Therefore its length is 4.
Example 2:

Input: nums = [0,3,7,2,5,8,4,6,0,1]
Output: 9
 

Constraints:

0 <= nums.length <= 105
-109 <= nums[i] <= 109

*/
/*
Runtime
Details
1092ms
Beats 5.10%of users with Java

Memory
Details
59.40MB
Beats 38.36%of users with Java
*/