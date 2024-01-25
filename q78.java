import java.util.*;

class q78 {
    List<List<Integer>> lst = new ArrayList<>();
    // lst.add(new ArrayList<>());

    public void backtrack(List<Integer> ans, int arr[], int start, int end) {
        if (start > end)
            return;
        lst.add(ans);
        // System.out.println(ans+","+start+","+end);
        for (int i = start; i < end; i++) {
            List<Integer> ls1 = new ArrayList<>(ans);
            ls1.add(arr[i]);
            backtrack(ls1, arr, i + 1, end);
        }
    }

    public List<List<Integer>> subsets(int[] arr) {

        backtrack(new ArrayList<>(), arr, 0, arr.length);
        return lst;
    }
}
/*
 * Q78. Subsets
 * 
 * Given an integer array nums of unique elements, return all possible
 * subsets
 * (the power set).
 * 
 * The solution set must not contain duplicate subsets. Return the solution in
 * any order.
 * 
 * 
 * 
 * Example 1:
 * 
 * Input: nums = [1,2,3]
 * Output: [[],[1],[2],[1,2],[3],[1,3],[2,3],[1,2,3]]
 * Example 2:
 * 
 * Input: nums = [0]
 * Output: [[],[0]]
 * 
 * 
 * Constraints:
 * 
 * 1 <= nums.length <= 10
 * -10 <= nums[i] <= 10
 * All the numbers of nums are unique.
 */
/*
 * Runtime
 * 0ms Beats 100.00% of users with Java
 * 
 * Memory
 * 42.66MB Beats 35.57% of users with Java
 */