
class Solution {
    public String bitwiseor(int a, int b){
        
        return Integer.toBinaryString((a|b));
    }
    public String zeros(int len){
        String ans="";
        for(int i=1;i<=len;i++)
            ans+="0";
        return ans;
    }
    public int minFlips(int a, int b, int c) {
        System.out.println("a : "+Integer.toBinaryString(a));
        System.out.println("b : "+Integer.toBinaryString(b));
        System.out.println("c : "+Integer.toBinaryString(c));
        String s1=Integer.toBinaryString(a);
        String s2=Integer.toBinaryString(b);
        String s3=Integer.toBinaryString(c);
        int len1=s1.length(),len2=s2.length(),len3=s3.length(),sum=0;
        System.out.println("s1 : "+s1);
        System.out.println("s2 : "+s2);
        System.out.println("s3 : "+s3);
        System.out.println("len1 : "+len1);
        System.out.println("len2 : "+len2);
        System.out.println("len3 : "+len3);
        int maxl=Math.max(len1,Math.max(len2,len3));
        s3=zeros(maxl-len3)+s3;
        s2=zeros(maxl-len2)+s2;
        s1=zeros(maxl-len1)+s1;
        System.out.println("new s1 : "+s1);
        System.out.println("new s2 : "+s2);
        System.out.println("new s3 : "+s3);
        System.out.println("Characters");
        for(int i=0;i<s3.length();i++){
            char c1=s1.charAt(i);
            char c2=s2.charAt(i);
            char c3=s3.charAt(i);
            System.out.print(c1+"\t"+c2+"\t"+c3);
            if(c1=='1' && c2=='1' && c3=='0'){
                sum+=2; 
                System.out.println("\t --> "+sum);
                continue;
            }
            //if((c1=='1' && c2=='0' && c3=='0')||(c1=='0' && c2=='1' && c3=='0')||(c1=='0' && c2=='0' && c3=='1')||(c1=='1' && c2=='1' && c3=='1')){
            //    sum+=1;
            //}
            int k1=Character.getNumericValue(c1),k2=Character.getNumericValue(c2),k3=Character.getNumericValue(c3);
            if((k1|k2)==k3)
                continue;
            else
                sum+=1;
            System.out.println("\t --> "+sum);
        }
        return sum;
    }
}
/** manav Khandurie
 * 
 * Given 3 positives numbers a, b and c. Return the minimum flips required in some bits of a and b to make ( a OR b == c ). (bitwise OR operation).
Flip operation consists of change any single bit 1 to 0 or change the bit 0 to 1 in their binary representation.

 

Example 1:



Input: a = 2, b = 6, c = 5
Output: 3
Explanation: After flips a = 1 , b = 4 , c = 5 such that (a OR b == c)
Example 2:

Input: a = 4, b = 2, c = 7
Output: 1
Example 3:

Input: a = 1, b = 2, c = 3
Output: 0
 

Constraints:

1 <= a <= 10^9
1 <= b <= 10^9
1 <= c <= 10^9
 * 
 */