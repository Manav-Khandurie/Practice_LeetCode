class q240 {

    public boolean binarysearch(int []ar,int target){
        int start=0,end=ar.length-1,mid=0;
        while(start<=end){
            mid=(start+end)/2;
            if(ar[mid]==target){
                return true;
            }
            else if(ar[mid]<target)
                start=mid+1;
            else
                end=mid-1;
        }
        return false;
    }
    public boolean searchMatrix(int[][] ar, int target) {
        int m=ar.length,n=ar[0].length;
        if(n==1 && m==1){
            return (ar[0][0]==target);
        }
        else if(m==1 && n>1){
            return binarysearch(ar[0],target);
        }
        else{
            for(int x[] : ar){
                if(binarysearch(x,target))// O(mlogn)
                    return true;
            }
            return false;
        }
    }
}