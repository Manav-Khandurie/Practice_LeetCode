class Solution {
    public String mergeAlternately(String word1, String word2) {
        int n=word1.length(),m=word2.length();

        char ch1[]=word1.toCharArray();
        char ch2[]=word2.toCharArray();
        int i=0,j=0,count=0;        
        String s3="";
        for( ; i<n && j<m ;count++){
            if(count%2==0){
                //word1
                s3+=ch1[i];
                i++;
            }
            else{
                s3+=ch2[j];
                j++;
            }
        }
        for( ; i<n  ;i++)
            s3+=ch1[i];
        for( ; j<m ;j++)
            s3+=ch2[j];

        return s3;
    }
}
/*
q1768 Merge Strings Alternately

You are given two strings word1 and word2. Merge the strings by adding letters in alternating order, starting with word1. If a string is longer than the other, append the additional letters onto the end of the merged string.

Return the merged string.

 

Example 1:

Input: word1 = "abc", word2 = "pqr"
Output: "apbqcr"
Explanation: The merged string will be merged as so:
word1:  a   b   c
word2:    p   q   r
merged: a p b q c r
Example 2:

Input: word1 = "ab", word2 = "pqrs"
Output: "apbqrs"
Explanation: Notice that as word2 is longer, "rs" is appended to the end.
word1:  a   b 
word2:    p   q   r   s
merged: a p b q   r   s


Java
Runtime
7 ms
Beats
25.61%
Memory
42.2 MB
Beats
6.48%

*/