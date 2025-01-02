import java.util.*;
class q2559 {
    public boolean isVowel(char x){
        return x=='a' || x=='e' || x=='o' || x=='i' || x=='u';
    }
    public int[] vowelStrings(String[] words, int[][] queries) {
        int n=words.length,u=0,index=0;
        int prefix[]=new int[n];
        for(String word : words){
            if( isVowel(word.charAt(0)) && isVowel(word.charAt(word.length()-1)) )
                prefix[index]=++u;
            else
                prefix[index]=u;
            index++;
        }
        u=0;
        int ans[]=new int[queries.length];
        for(int query[] : queries){
            int start=query[0],end=query[1];
            int answer=0;
            if(start==0)
                answer=prefix[end];
            else
                answer=prefix[end]-prefix[start-1];
            ans[u++]=answer;
        }
        return ans;
    }
}