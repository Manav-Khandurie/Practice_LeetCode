class q169 {
    public int majorityElement(int[] arr) {
        /*
        Initialize an element m and a counter i with i = 0
        For each element x of the input sequence:
        If i = 0, then assign m = x and i = 1
        else if m = x, then assign i = i + 1
        else assign i = i − 1
        Return m

        Boyer–Moore majority vote algorithm
        */

        int m=arr[0],i=0;
        for(int x: arr){
            if(i==0){
                m=x;
                i=i+1;
            }
            else if( m==x)
                i++;
            else
                i--;
        }
        return m;
       
    }
}


