import java.util.*;
class q1930 {
    public int countPalindromicSubsequence(String s) {
        Set<Character> letter=new HashSet<>();
        char ch[]=s.toCharArray();
        for(char x : ch){
            letter.add(x);
        }
        // aabca --> [a,c,b]
        int ans=0,n=ch.length;
        for(char x : letter){
            int first=-1,last=-1;
            for(int k=0;k<n;k++){
                if(ch[k]==x){
                    if(first==-1)
                        first=k;
                    last=k;
                }
            }
            Set<Character> unique=new HashSet<>();
            for(int k=first+1;k<=last-1;k++)
                unique.add(ch[k]);
            ans+=unique.size();
        }
        return ans;
    }
}