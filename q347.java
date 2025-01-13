import java.util.*;
class q347 {
    public int[] topKFrequent(int[] nums, int k) {
        //Make a max heap first
        HashMap<Integer,Integer> hm=new HashMap<>();
        PriorityQueue<Integer> maxheap=new PriorityQueue<>((n1,n2)-> hm.get(n1)-hm.get(n2));
        
        //Add all elements to a hashmap
        int i=0,n=nums.length;
        for(i=0;i<n;i++)
            hm.put(nums[i],hm.getOrDefault(nums[i],0)+1);
        //System.out.println(hm);

        //make a heap just use a countKey
        for(int x : hm.keySet()){
            maxheap.offer(x);
            if(maxheap.size()>k)
                maxheap.poll();
        }
        //System.out.println(maxheap);

        int ans[]=new int[k];
        for(i=0;i<k;i++)
            ans[i]=maxheap.poll();

        return ans;
    }
}