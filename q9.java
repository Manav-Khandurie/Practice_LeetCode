class q9 {
    public boolean isPalindrome(int x) {
        String number=Integer.toString(x);
        int rev=0;
        while(x>0){
            int d=x%10;
            rev=rev*10+d;
            x/=10;
        }
        String reverse=Integer.toString(rev);
        reverse.trim();number.trim();
        if(reverse.equals(number))
            return true;
        else
            return false;
    }
}