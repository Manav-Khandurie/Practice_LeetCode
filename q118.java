import java.util.*;
class Solution {

    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> lst=new ArrayList<List<Integer>>();
        lst.add(List.of(1)); 
        int ele;
        for(int i=1;i<numRows;i++){
            List<Integer> ls=new ArrayList<>();
            ls.add(1);
            List<Integer> plist=lst.get(lst.size()-1);
            for(int j=1;j<i;j++){
                ele=plist.get(j)+plist.get(j-1);
                ls.add(ele);
            }
            ls.add(1);
            lst.add(ls);
        }
        return lst;
    }
}

/***
 * 
 * Given an integer numRows, return the first numRows of Pascal's triangle.

In Pascal's triangle, each number is the sum of the two numbers directly above it as shown:


 

Example 1:

Input: numRows = 5
Output: [[1],[1,1],[1,2,1],[1,3,3,1],[1,4,6,4,1]]
 */