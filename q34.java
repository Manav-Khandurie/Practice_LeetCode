class q34 {

    public int binarySearch(int[] arr, int start, int end, int search) {
        int mid = 0;
        while (start <= end) {
            mid = (start + end) / 2;
            if (arr[mid] == search) {
                return mid;
            } else if (arr[mid] > search)
                end = mid - 1;
            else
                start = mid + 1;
        }

        return -1;
    }

    public int[] searchRange(int[] nums, int target) {

        int n = nums.length;
        if (n == 0) {
            int ans[] = { -1, -1 };
            return ans;
        }
        int index = binarySearch(nums, 0, nums.length - 1, target);
        int i = index, j = index;
        while (i >= 0 && j <= n - 1 && nums[i] == nums[j]) {
            i--;
            j++;
        }
        if (index == -1) {
            int ans[] = { -1, -1 };
            return ans;
        }

        while (j <= n - 1 && nums[j] == nums[index]) {
            j++;
        }
        while (i >= 0 && nums[i] == nums[index]) {
            i--;
        }
        int ans[] = { i + 1, j - 1 };
        return ans;
    }
}
/*
 * Q34. Find First and Last Position of Element in Sorted Array
 * 
 * Given an array of integers nums sorted in non-decreasing order, find the
 * starting and ending position of a given target value.
 * 
 * If target is not found in the array, return [-1, -1].
 * 
 * You must write an algorithm with O(log n) runtime complexity.
 * 
 * 
 * 
 * Example 1:
 * 
 * Input: nums = [5,7,7,8,8,10], target = 8
 * Output: [3,4]
 * Example 2:
 * 
 * Input: nums = [5,7,7,8,8,10], target = 6
 * Output: [-1,-1]
 * Example 3:
 * 
 * Input: nums = [], target = 0
 * Output: [-1,-1]
 * 
 * 
 * Constraints:
 * 
 * 0 <= nums.length <= 105
 * -109 <= nums[i] <= 109
 * nums is a non-decreasing array.
 * -109 <= target <= 109
 */
/*
 * Runtime
 * 0ms Beats 100.00% of users with Java
 * 
 * Memory
 * 45.93MB Beats 28.15% of users with Java
 */