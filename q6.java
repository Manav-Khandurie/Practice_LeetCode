class q6 {
    public String convert(String s, int n) {
        if(n==1)
            return s;
        String []arr=new String[n];
        int k=0,m=s.length(); boolean flag=true;
        for(int x=0;x<m;x++){
            if(arr[k]==null)    arr[k]="";
            arr[k]+=s.charAt(x);
            //System.out.println(arr[k]);
            if(flag)    k++;
            else        k--;

            if(k>=n){
                flag=false;
                k=n-2;
            }else if(k<0){
                flag=true;
                k=1;
            }
        }

        StringBuilder ans=new StringBuilder();
        for(int x=0;x<arr.length;x++){
            if(arr[x]!=null)
                ans.append(arr[x]);
        }
        return ans.toString();
    }
}