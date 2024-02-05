import java.util.*;

class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        // Create a montonic dec deque [only indices]
        Deque<Integer> dq = new ArrayDeque<>();
        // Add k elements to dequeue
        int i = 0, n = nums.length, u = 0;
        int arr[] = new int[n - k + 1];
        for (i = 0; i < n; i++) {
            while (dq.size() > 0 && dq.peekFirst() <= i - k)
                dq.pollFirst();
            while (dq.size() > 0 && nums[dq.peekLast()] < nums[i])
                dq.pollLast();
            dq.offerLast(i);
            if (i >= k - 1)
                arr[u++] = nums[dq.peekFirst()];
        }
        return arr;
    }
}
/*
 * Q239. Sliding Window Maximum
 * 
 * You are given an array of integers nums, there is a sliding window of size k
 * which is moving from the very left of the array to the very right. You can
 * only see the k numbers in the window. Each time the sliding window moves
 * right by one position.
 * 
 * Return the max sliding window.
 * 
 * 
 * 
 * Example 1:
 * 
 * Input: nums = [1,3,-1,-3,5,3,6,7], k = 3
 * Output: [3,3,5,5,6,7]
 * Explanation:
 * Window position Max
 * --------------- -----
 * [1 3 -1] -3 5 3 6 7 3
 * 1 [3 -1 -3] 5 3 6 7 3
 * 1 3 [-1 -3 5] 3 6 7 5
 * 1 3 -1 [-3 5 3] 6 7 5
 * 1 3 -1 -3 [5 3 6] 7 6
 * 1 3 -1 -3 5 [3 6 7] 7
 * Example 2:
 * 
 * Input: nums = [1], k = 1
 * Output: [1]
 * 
 * 
 * Constraints:
 * 
 * 1 <= nums.length <= 105
 * -104 <= nums[i] <= 104
 * 1 <= k <= nums.length
 */
/*
 * Runtime
 * 32ms Beats 55.22% of users with Java
 * 
 * Memory
 * 58.62MB Beats 64.78% of users with Java
 */