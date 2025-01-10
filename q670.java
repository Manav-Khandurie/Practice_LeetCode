class q670 {
    public int maximumSwap(int num) {
        char ch[]=(num+"").toCharArray();
        int n=ch.length;
        int max[]=new int[n]; //indexes
        int maxed=n-1;
        for(int i=n-1;i>=0;i--){
            if(ch[maxed] < ch[i]){
                maxed=i;
            }
            max[i]=maxed;
        }
        int k=0;
        while(k<n){
            if(ch[max[k]] > ch[k]){
                //swap
                int a=max[k],b=k;
                char temp=ch[a];
                ch[a]=ch[b];
                ch[b]=temp;
                break;
            }
            k++;
        }
        int sum=0;
        for(char x : ch)
            sum = sum *10 + Character.getNumericValue(x); 
        return sum;
    }
}