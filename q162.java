class q162 {
    public boolean check(int mid, int arr[]) {
        boolean c1 = (mid == arr.length - 1) ? true : arr[mid] > arr[mid + 1];
        boolean c2 = (mid == 0) ? true : arr[mid] > arr[mid - 1];
        return (c1 && c2);
    }

    public int findPeakElement(int[] arr) {

        if (arr.length == 1 || arr.length == 2) {
            if (arr.length == 1)
                return 0;
            if (arr.length == 2)
                return (arr[1] > arr[0]) ? 1 : 0;

        }
        int begin = 0, end = arr.length - 1, mid = 0, mid2 = 0, n = arr.length;
        while (begin <= end) {
            mid = (int) Math.ceil((begin + end) / 2.0);
            if (check(mid, arr))
                return mid;
            else if (mid != n - 1 && arr[mid + 1] > arr[mid])
                begin = mid + 1;
            else
                end = mid - 1;
        }

        // Now check for those boundary elements

        if (arr[0] > arr[1])
            return 0;
        if (arr[n - 1] > arr[n - 2])
            return n - 1;
        return -1;
    }
}
/*
 * 
 * Q162. Find Peak Element
 * 
 * A peak element is an element that is strictly greater than its neighbors.
 * 
 * Given a 0-indexed integer array nums, find a peak element, and return its
 * index. If the array contains multiple peaks, return the index to any of the
 * peaks.
 * 
 * You may imagine that nums[-1] = nums[n] = -∞. In other words, an element is
 * always considered to be strictly greater than a neighbor that is outside the
 * array.
 * 
 * You must write an algorithm that runs in O(log n) time.
 * 
 * 
 * 
 * Example 1:
 * 
 * Input: nums = [1,2,3,1]
 * Output: 2
 * Explanation: 3 is a peak element and your function should return the index
 * number 2.
 * Example 2:
 * 
 * Input: nums = [1,2,1,3,5,6,4]
 * Output: 5
 * Explanation: Your function can return either index number 1 where the peak
 * element is 2, or index number 5 where the peak element is 6.
 * 
 * 
 * Constraints:
 * 
 * 1 <= nums.length <= 1000
 * -231 <= nums[i] <= 231 - 1
 * nums[i] != nums[i + 1] for all valid i.
 */
/*
 * Runtime
 * 0ms Beats 100.00% of users with Java
 * 
 * Memory
 * 42.03MB Beats 45.01% of users with Java
 */