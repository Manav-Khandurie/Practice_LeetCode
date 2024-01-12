public class q1704 {
    public int countVowels(int i, int j, String s) {
        int c = 0;
        for (; i < j; i++) {
            char ch = s.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I'
                    || ch == 'O' || ch == 'U')
                c++;
        }
        return c;
    }

    public boolean halvesAreAlike(String s) {
        int m = s.length();
        int n = m / 2;
        int c1 = countVowels(0, n, s);
        int c2 = countVowels(n, m, s);
        return c1 == c2;
    }
}
/*
 * Q1704. Determine if String Halves Are Alike
 * 
 * You are given a string s of even length. Split this string into two halves of
 * equal lengths, and let a be the first half and b be the second half.
 * 
 * Two strings are alike if they have the same number of vowels ('a', 'e', 'i',
 * 'o', 'u', 'A', 'E', 'I', 'O', 'U'). Notice that s contains uppercase and
 * lowercase letters.
 * 
 * Return true if a and b are alike. Otherwise, return false.
 * 
 * 
 * Example 1:
 * 
 * Input: s = "book"
 * Output: true
 * Explanation: a = "bo" and b = "ok". a has 1 vowel and b has 1 vowel.
 * Therefore, they are alike.
 * Example 2:
 * 
 * Input: s = "textbook"
 * Output: false
 * Explanation: a = "text" and b = "book". a has 1 vowel whereas b has 2.
 * Therefore, they are not alike.
 * Notice that the vowel o is counted twice.
 * 
 * 
 * Constraints:
 * 
 * 2 <= s.length <= 1000
 * s.length is even.
 * s consists of uppercase and lowercase letters.
 */
/*
 * Runtime
 * 1ms Beats 100.00% of users with Java
 * 
 * Memory
 * 41.88MB Beats 24.13% of users with Java
 */