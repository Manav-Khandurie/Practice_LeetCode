import java.util.*;
class Solution {
    public int compress(char[] chars) {
        int count=1;char search=chars[0];
        String s="";
        for(int i=1;i<chars.length;i++){
            if(search==chars[i]){
                count++;
            }
            else{
                s+=search;
                if(count!=1)
                    s+=count;
                count=0;
                search=chars[i];
                i--;
            }
        }
        if(count>1){
            s+=search;
            s+=count;
        }
        else
            s+=search;
        
        int value=s.length();
        for(int i=0;i<value;i++){
            chars[i]=s.charAt(i);
        }

        return value;
    }
}