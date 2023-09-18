class q1768 {
    public String mergeAlternately(String word1, String word2) {
        int n=word1.length(),m=word2.length();

        char ch1[]=word1.toCharArray();
        char ch2[]=word2.toCharArray();
        int i=0,j=0,count=0;        
        String s3="";
        for( ; i<n && j<m ;count++){
            if(count%2==0){
                //word1
                s3+=ch1[i];
                i++;
            }
            else{
                s3+=ch2[j];
                j++;
            }
        }
        for( ; i<n  ;i++)
            s3+=ch1[i];
        for( ; j<m ;j++)
            s3+=ch2[j];

        return s3;
    }
}