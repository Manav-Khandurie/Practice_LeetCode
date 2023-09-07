class Solution {
    public String reverseWords(String s) {
        //s.trim();
        String word="",t="";
        //s+=" ";
        int i=0,n=s.length();char ch;
        for(i=0;i<n;i++){
            ch=s.charAt(i);
            //System.out.println(ch);
            if(ch==' ' && word=="")  {
                //System.out.println("here:");
                continue;
            }
            else if(ch==' '){
                //System.out.println(""+word);
                t=word+" "+t;
                word="";
                //t+=" ";
            }
            else
                word+=ch;
        }
        return word+" "+t;
    }
}
/**
 * Given an input string s, reverse the order of the words.

A word is defined as a sequence of non-space characters. The words in s will be separated by at least one space.

Return a string of the words in reverse order concatenated by a single space.

Note that s may contain leading or trailing spaces or multiple spaces between two words. The returned string should only have a single space separating the words. Do not include any extra spaces.

 

Example 1:

Input: s = "the sky is blue"
Output: "blue is sky the"
Example 2:

Input: s = "  hello world  "
Output: "world hello"
Explanation: Your reversed string should not contain leading or trailing spaces
 */