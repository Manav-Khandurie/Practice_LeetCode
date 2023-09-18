import java.util.*;
class q46 {
    List<List<Integer>> lst=new ArrayList<List<Integer>>();
    //List of a List
    public void rec(List<Integer> ans,List<Integer> ls){
        if(ls.size()==1){
            int n=ls.get(0);
            ans.add(n);//ading final element to the ans list
            lst.add(ans);//add the final list to lst
        }
        else{
            //we ilterate ls
            for(int i=0;i<ls.size();i++){
                List<Integer> ls1=new ArrayList<Integer>(ans);
                List<Integer> ls2=new ArrayList<Integer>(ls);
                //copy of original list
                ls1.add(ls2.get(i));//add element at i to next ans list
                ls2.remove(i);//remove element for the next ls list 
                rec(ls1,ls2);
            }
        }
    }
    public List<Integer> convert(int[] a){
        List<Integer> ls=new ArrayList<Integer>();//empty list
        for(int i=0;i<a.length;i++){
            ls.add(a[i]);// [1] , [1,2] , [1,2,3]
        }
        return ls;//[1,2,3] ArrayList
    }
    public List<List<Integer>> permute(int[] nums) {
        List<Integer> ls1=new ArrayList<Integer>();//empty list
        rec(ls1,convert(nums));//(ls1,ls)
        return lst;
    }
}