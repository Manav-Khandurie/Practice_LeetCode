import java.util.*;
import java.util.regex.*;
class q394 {
    public String decodeString(String s) {
        Stack <String> stk=new Stack<String>();
        String t="";
        stk.push("");
        for(int i=0;i<s.length();i++){
            String entry=String.valueOf(s.charAt(i));
            if(entry.equals("]")){
                String temp="",poped=stk.pop();
                while(!poped.equals("[")){
                    temp=poped+temp;
                    poped=stk.pop();
                }
                String number=stk.pop();
                int times=Integer.parseInt(number);
                for(int j=1;j<=times;j++)
                stk.push(temp);
            }
            else if(Character.isDigit(s.charAt(i))){
                String temp="";
                if(Pattern.compile("[0-9]").matcher(stk.peek()).find()){
                 temp=stk.pop();
                }
                stk.push(temp+entry);
            }else
                stk.push(entry);
        }
        while(!stk.empty()){
            t=stk.pop()+t;
            }
        return t;
    }
}
/*
Q394 Decode String

Given an encoded string, return its decoded string.

The encoding rule is: k[encoded_string], where the encoded_string inside the square brackets is being repeated exactly k times. Note that k is guaranteed to be a positive integer.

You may assume that the input string is always valid; there are no extra white spaces, square brackets are well-formed, etc. Furthermore, you may assume that the original data does not contain any digits and that digits are only for those repeat numbers, k. For example, there will not be input like 3a or 2[4].

The test cases are generated so that the length of the output will never exceed 105.

 

Example 1:

Input: s = "3[a]2[bc]"
Output: "aaabcbc"
Example 2:

Input: s = "3[a2[c]]"
Output: "accaccacc"
Example 3:

Input: s = "2[abc]3[cd]ef"
Output: "abcabccdcdcdef"
 

Constraints:

1 <= s.length <= 30
s consists of lowercase English letters, digits, and square brackets '[]'.
s is guaranteed to be a valid input.
All the integers in s are in the range [1, 300].
 */
/*
Runtime
Memory

Accepted
Jul 09, 2023
Java
3 ms
41 MB
 */