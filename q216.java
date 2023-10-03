import java.util.ArrayList;
import java.util.List;

class q216 {

    List<List<Integer>> ls=new ArrayList<List<Integer>>();
    int k;
    public void backtrack(int k,int target ,List<Integer> arr,List<Integer> selected,int sum){

       if(k>this.k || sum>target){
           return;
       }
       if(sum==target && k==this.k){
           //System.out.println("here");
           ls.add(selected);
           return;
       }
       Integer ele;
       List<Integer> arr1=new ArrayList<Integer>(arr);
       for(int i=0;i<arr.size();i++){
           ele=arr.get(i);
           List<Integer> selected1=new ArrayList<Integer>(selected);
           selected1.add(ele);
           arr1.remove(ele);
           //System.out.println(selected1+"<-->"+arr1);
           backtrack(k+1,target,arr1,selected1,sum+ele);
       }
       return;
    }

    public List<List<Integer>> combinationSum3(int k, int n) {
        this.k=k;
        List<Integer> arr=new ArrayList<>();
        //List.of(1,2,3,4,5,6,7,8,9);

        arr.add(1);arr.add(2);arr.add(3);arr.add(4);arr.add(5);arr.add(6);arr.add(7);arr.add(8);arr.add(9);arr.add(10);
        backtrack(0,n,arr,new ArrayList<Integer>(),0);
        return ls;
    }
}
/*
Combination Sum III

Find all valid combinations of k numbers that sum up to n such that the following conditions are true:

Only numbers 1 through 9 are used.
Each number is used at most once.
Return a list of all possible valid combinations. The list must not contain the same combination twice, and the combinations may be returned in any order.

Example 1:

Input: k = 3, n = 7
Output: [[1,2,4]]
Explanation:
1 + 2 + 4 = 7
There are no other valid combinations.
Example 2:

Input: k = 3, n = 9
Output: [[1,2,6],[1,3,5],[2,3,4]]
Explanation:
1 + 2 + 6 = 9
1 + 3 + 5 = 9
2 + 3 + 4 = 9
There are no other valid combinations.
Example 3:

Input: k = 4, n = 1
Output: []
Explanation: There are no valid combinations.
Using 4 different numbers in the range [1,9], the smallest sum we can get is 1+2+3+4 = 10 and since 10 > 1, there are no valid combination.
 

Constraints:

2 <= k <= 9
1 <= n <= 60



Runtime
1 ms
Beats
38.7%

Memory
40.7 MB
Beats
5.48%
 */