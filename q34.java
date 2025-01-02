class q34 {
    int binarySearch(int[] arr, int start, int end, int target, int fix) {
        int index = -1;
        while (start <= end) {
            int mid = start + (end - start) / 2; 
            if (arr[mid] == target) {
                index = mid; 
                if (fix < 0) {
                    end = mid - 1; // Search the left part for the first occurrence
                } else {
                    start = mid + 1; // Search the right part for the last occurrence
                }
            } else if (arr[mid] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return index;
    }

    public int[] searchRange(int[] nums, int target) {
        if (nums == null || nums.length == 0) 
            return new int[]{-1, -1}; 
        int first = binarySearch(nums, 0, nums.length - 1, target, -1); 
        int last = binarySearch(nums, 0, nums.length - 1, target, 1);
        return new int[]{first, last};
    }
}
