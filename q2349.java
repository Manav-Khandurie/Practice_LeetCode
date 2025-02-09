class q2349 {
    Map<Integer,Integer> array;
    Map<Integer,PriorityQueue<Integer>> numberToIndices;
    public NumberContainers() {
        array=new HashMap<>();
        numberToIndices=new HashMap<>();
    }
    
    public void change(int index, int number) {
        array.put(index, number);
        numberToIndices
            .computeIfAbsent(number, k -> new PriorityQueue<>())
            .add(index);
    }
    
    public int find(int number) {
        if(!numberToIndices.containsKey(number))
            return -1; //NOT PRESENT
        PriorityQueue<Integer> temp=numberToIndices.get(number);
        while(!temp.isEmpty()){
            int ind=temp.peek();
            if(array.get(ind)==number)
                return ind;
            temp.poll();
        }
        return -1;
    }
}