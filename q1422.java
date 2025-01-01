class q1422 {
    public int maxScore(String s) {
        char ch[]=s.toCharArray();
        int n=ch.length;
        int zeros[]=new int[n];
        int ones[]=new int[n];
        int zero=0,one=0,ans=0;
        //S-1) Fill 0's
        for(int i=0;i<n;i++){
            if(ch[i]=='0')
                zeros[i]=++zero;
        }
        //S-2) Fill 1's
        for(int i=n-1;i>=0;i--){
            if(ch[i]=='1')
                ones[i]=++one;
        }
        //S-3) Get split max
        int i=0,j=1;
        while(j<n){
            ans=Math.max(ans,(zeros[i]+ones[j]));
            i++;j++;
        }
        return ans;
    }
}