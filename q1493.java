import java.util.*;

class q1493 {
    public int longestSubarray(int[] nums) {
        int max = Integer.MIN_VALUE;
        boolean flag = false;
        int i = 0, n = nums.length, j = 0;
        if (n == 1)
            return n - 1;

        for (; i < n; i++) {
            if (nums[i] == 1)
                continue;
            if (nums[i] == 0 && !flag) {
                flag = true;
                continue;
            } else if (nums[i] == 0 && flag) {
                // System.out.println(i-j-1);
                // System.out.println(j+"|\t|"+i);
                max = Math.max(i - j - 1, max);
                while (j - 1 < i) {
                    j++;
                    if (nums[j - 1] == 0) {
                        flag = false;
                        break;
                    }
                }
                i--;
                // System.out.println(j+"\t"+i);
            }
        }
        max = Math.max(max, i - j - 1);
        return (max == Integer.MIN_VALUE) ? n - 1 : max;

    }
}
/*
 * Q1493. Longest Subarray of 1's After Deleting One Element
 * 
 * Given a binary array nums, you should delete one element from it.
 * 
 * Return the size of the longest non-empty subarray containing only 1's in the
 * resulting array. Return 0 if there is no such subarray.
 * 
 * 
 * 
 * Example 1:
 * 
 * Input: nums = [1,1,0,1]
 * Output: 3
 * Explanation: After deleting the number in position 2, [1,1,1] contains 3
 * numbers with value of 1's.
 * Example 2:
 * 
 * Input: nums = [0,1,1,1,0,1,1,0,1]
 * Output: 5
 * Explanation: After deleting the number in position 4, [0,1,1,1,1,1,0,1]
 * longest subarray with value of 1's is [1,1,1,1,1].
 * Example 3:
 * 
 * Input: nums = [1,1,1]
 * Output: 2
 * Explanation: You must delete one element.
 * 
 * 
 * Constraints:
 * 
 * 1 <= nums.length <= 105
 * nums[i] is either 0 or 1.
 */
/*
 * Runtime
 * 2ms Beats 98.77% of users with Java
 * 
 * Memory
 * 57.01MB Beats 30.07% of users with Java
 */