class q848 {
    char shift(char ch,long x){
        long val=(long)ch-97; // a(97) -->a(0)
        val+=x;
        // val --> 26 -> a
        val%=26;
        return (char)(val+97);
    }
    public String shiftingLetters(String s, int[] shifts) {
        long total=0;
        char str[]=s.toCharArray();
        int n=str.length;
        long post[]=new long[n];
        for(int k=n-1;k>=0;k--){
            total+=shifts[k];
            post[k]=total;
        }
        for(int k=0;k<n;k++){
            str[k]=shift(str[k],post[k]);
        }
        return new String(str);
    }
}