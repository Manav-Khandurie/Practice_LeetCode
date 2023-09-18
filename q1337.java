//import java.util.*;
class q1337 {
    public int[] kWeakestRows(int[][] mat, int k) {
        //Hashtable<Integer,Integer> hst=new Hashtable<>();
        int i=0,j=0,m=mat.length,n=mat[i].length,count=0,pointer=0,temp;
        int elements[]=new int[m];
        int freq[]=new int[m];
        for(i=0;i<m;i++){
            for(j=0;j<n;j++){
                if(mat[i][j]==1)
                    count++;
            }
            elements[pointer]=i;
            freq[pointer]=count;
            pointer++;
            count=0;
        }
        int arr[]=new int[k];
        pointer=0;
        for(i=0;i<m;i++){
            for(j=0;j<m-1-i;j++){
                if(freq[j+1]<freq[j]){
                    temp=freq[j+1];
                    freq[j+1]=freq[j];
                    freq[j]=temp;
                    temp=elements[j];
                    elements[j]=elements[j+1];
                    elements[j+1]=temp;
                }
            }
        }

        for(i=0;i<k;i++)
            arr[i]=elements[i];

        return arr;
    }
}