class Solution {
    public String reverseOnlyLetters(String s) {
        char temp;
        //add all chars/letters to a stack
        int i=0,n=s.length(),j=n-1;
        char chars[]=s.toCharArray();
        while(i<=j){
            if(Character.isLetter(chars[i]) && Character.isLetter(chars[j])){
                temp=chars[i];
                chars[i]=chars[j];
                chars[j]=temp;
                i++;j--;
            }
            else if(!Character.isLetter(chars[i]))
            i++;
            else if(!Character.isLetter(chars[j]))
            j--;
        }
        return new String(chars);
    }
}
//"ab-cd"

//Test1ng-Leet=code-Q!
/*
 * By  Manav-Khandurie
 * 
 * 
Runtime
Details 
0ms
Beats 100.00%of users with Java


Memory
Details
40.43MB
Beats 66.36%of users with Java
 */