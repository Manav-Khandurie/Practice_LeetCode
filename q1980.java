import java.util.*;
class q1980 {
    Set<String> seen=new HashSet<>();
    String ans=null;
    public void addToHashSet(String s[]){
        for(String v:s)
            seen.add(v);
    }
    public void backtrack(int n,StringBuilder sb,int curr){
        if(ans!=null || curr>n){
            return;
        }
        if(curr==n){
            String s=sb.toString();
            if(!seen.contains(s))
                ans=s;
            return;
        }
        sb.append('0');
        backtrack(n,sb,curr+1);
        sb.deleteCharAt(sb.length()-1);
        sb.append('1');
        backtrack(n,sb,curr+1);
        sb.deleteCharAt(sb.length()-1);
    }
    public String findDifferentBinaryString(String[] nums) {

        addToHashSet(nums);
        backtrack(nums.length,new StringBuilder(),0);
        return ans;
    }
}