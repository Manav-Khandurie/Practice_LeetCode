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
//