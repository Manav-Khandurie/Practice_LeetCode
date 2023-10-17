class Solution {
    public boolean isAnagram(String s, String t) {
       int n=s.length(),m=t.length();
       if(n!=m) return false;
       char ch;
       HashMap<Character,Integer> hm=new HashMap<>();
       int i=0;
       for(i=0;i<n;i++){
           Integer a=0;
           ch=s.charAt(i);
           if(hm.containsKey(ch)){
               a=hm.get(ch);
           }
           hm.put(ch,a+1);
       }
       for(i=0;i<m;i++){
           Integer a=0;
           ch=t.charAt(i);
           if(hm.containsKey(ch)){
               a=hm.get(ch);
               hm.put(ch,a-1);
           }
       }
       
       for (Map.Entry<Character, Integer> e : hm.entrySet())
            if(e.getValue()!=0)
                return false;
       //System.out.println(hm);
       return true;
    }
}
/*
Q242 Valid Anagram

Given two strings s and t, return true if t is an anagram of s, and false otherwise.

An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.

 

Example 1:

Input: s = "anagram", t = "nagaram"
Output: true
Example 2:

Input: s = "rat", t = "car"
Output: false
 

Constraints:

1 <= s.length, t.length <= 5 * 104
s and t consist of lowercase English letters.

*/
/*
Runtime
Details
17ms
Beats 20.70%of users with Java

Memory
Details
43.74MB
Beats 24.28%of users with Java
*/