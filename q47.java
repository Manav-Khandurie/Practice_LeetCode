import java.util.*;
class q47 {
    List<List<Integer>> lst=new ArrayList<>();
    public List<Integer> toList(int []arr){
        List<Integer> ls=new ArrayList<>();
        for(int x : arr)
            ls.add(x);
        return ls;
    }

    public void backtrack(List<Integer> ans,List<Integer> avaliable){
        if(avaliable==null || avaliable.size()<=0){
            lst.add(ans);
            return;
        }
        Set seen=new HashSet<>();
        for(Integer x : avaliable){
            if(!seen.contains(x)){
                List nlist=new ArrayList<>(avaliable);
                nlist.remove(x);
                List nans=new ArrayList<>(ans);
                nans.add(x);
                backtrack(nans,nlist);
            }
            seen.add(x);
        }
    }
    public List<List<Integer>> permuteUnique(int[] nums) {
       List<Integer> lis=toList(nums);
        backtrack(new ArrayList<>(),lis);
        return lst;
    }
}
/*
Q47. Permutations II

Given a collection of numbers, nums, that might contain duplicates, return all possible unique permutations in any order.

 

Example 1:

Input: nums = [1,1,2]
Output:
[[1,1,2],
 [1,2,1],
 [2,1,1]]
Example 2:

Input: nums = [1,2,3]
Output: [[1,2,3],[1,3,2],[2,1,3],[2,3,1],[3,1,2],[3,2,1]]
 

Constraints:

1 <= nums.length <= 8
-10 <= nums[i] <= 10
*/
/*
Runtime
4ms Beats 43.81% of users with Java

Memory
45.49MB Beats 9.89% of users with Java
*/