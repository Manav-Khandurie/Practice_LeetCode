class q14 {
    String getLCP(String a,String b){
        char ch1[]=a.toCharArray();
        char ch2[]=b.toCharArray();
        StringBuilder sb=new StringBuilder();
        int x=0,y=0;
        while(x<ch1.length && y<ch2.length){
            if(ch1[x]!=ch2[y])
                break;
            sb.append(ch1[x]);
            x++;y++;
        }
        return sb.toString();
    }
    public String longestCommonPrefix(String[] strs) {
        // LCP[x1 ... xn] = LCP[x1,x2] .... LCP
        if(strs.length==1)
            return strs[0];
        String ans=getLCP(strs[0],strs[1]);
        for(int i=2;i<strs.length;i++){
            ans=getLCP(ans,strs[i]);
        }
        return ans;
    }
}