import java.util.PriorityQueue;

class q215 {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> heap = new PriorityQueue<>();
        int i = 0;
        for (i = 0; i < nums.length; i++) {
            heap.add(nums[i]);
            // System.out.println(heap);
            if (heap.size() > k) {
                heap.poll();
            }
        }
        // System.out.println(heap);
        return heap.peek();
    }
}
/*
 * Q215 Kth Largest Element in an Array
 * 
 * Given an integer array nums and an integer k, return the kth largest element
 * in the array.
 * 
 * Note that it is the kth largest element in the sorted order, not the kth
 * distinct element.
 * 
 * Can you solve it without sorting?
 * 
 * 
 * 
 * Example 1:
 * 
 * Input: nums = [3,2,1,5,6,4], k = 2
 * Output: 5
 * Example 2:
 * 
 * Input: nums = [3,2,3,1,2,4,5,5,6], k = 4
 * Output: 4
 * 
 * 
 * Constraints:
 * 
 * 1 <= k <= nums.length <= 105
 * -104 <= nums[i] <= 104
 */
/*
 * Runtime
 * 62ms
 * Beats 30.06% of users with Java
 * 
 * Memory
 * 61.88MB
 * Beats 5.42% of users with Java
 */