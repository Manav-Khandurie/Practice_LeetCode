import java.util.*;
class q1207 {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i< arr.length;i++){
            if(hm.containsKey(arr[i])){
                hm.put(arr[i],hm.get(arr[i])+1);
                continue;
            }
            hm.put(arr[i],1);
        }
        HashSet<Integer> freq=new HashSet<>();

        for(int x : hm.keySet()){
            if(freq.contains(hm.get(x)))
                return false;
            freq.add(hm.get(x));
        }
        return true;
    }
}
/*
Q1207. Unique Number of Occurrences

Given an array of integers arr, return true if the number of occurrences of each value in the array is unique or false otherwise.

 

Example 1:

Input: arr = [1,2,2,1,1,3]
Output: true
Explanation: The value 1 has 3 occurrences, 2 has 2 and 3 has 1. No two values have the same number of occurrences.
Example 2:

Input: arr = [1,2]
Output: false
Example 3:

Input: arr = [-3,0,1,-3,1,1,1,-3,10,0]
Output: true
 

Constraints:

1 <= arr.length <= 1000
-1000 <= arr[i] <= 1000
*/
/*
Runtime
2ms Beats 98.10% of users with Java

Memory
41.65MB Beats 28.27% of users with Java
*/