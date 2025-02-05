import java.util.*;
class q1985 {
    public String kthLargestNumber(String[] nums, int k) {

        Comparator<String> customComparator = new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                if (s1.length() != s2.length()) {
                    return s1.length() - s2.length(); // Longer string is considered larger
                } else {
                    // If lengths are the same, compare lexicographically
                    return s1.compareTo(s2); // For max-heap, compare s2 to s1
                }
            }
        };


        PriorityQueue<String> pq=new PriorityQueue<>(customComparator);
        for(String x : nums)
            pq.offer(x);
        System.out.println(pq);
        while(pq.size()>k){
                pq.poll();
            }
        return pq.peek();
    }
}

/**
PriorityQueue<String> pq=new PriorityQueue<>((a,b)-> {
                int n=a.length(),m=b.length();
                if(n!=m)
                    return Math.abs(m-n);
                char ch1[]=a.toCharArray();
                char ch2[]=b.toCharArray();
                int i=0,j=0;
                while(i<n && j<m){
                    if(ch1[i]!=ch2[j])
                        return Math.abs(ch1[i]-ch2[j]);
                    i++;j++;
                }
                return 0;
            }
        );

 */