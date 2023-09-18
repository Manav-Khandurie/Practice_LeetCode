import java.util.*;
class q39 {
    List<List<Integer>> lst=new ArrayList<List<Integer>>();
    public void backtrack(int arr[],int sum,int target,int index,List<Integer> ls){
        if(sum==target){
            List<Integer> copy = new ArrayList<>(ls);
            lst.add(copy);
        }
        else if(sum>target)
            return;
        else{
            for(int i=index;i<arr.length;i++){
                Integer x=arr[i];
                ls.add(x);
                backtrack(arr,sum+arr[i],target,i,ls);
                ls.remove(x);
            }
        }
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        backtrack(candidates,0,target,0,new ArrayList<Integer>());

        return lst;
    }
}