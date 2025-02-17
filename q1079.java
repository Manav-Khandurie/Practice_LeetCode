class q1079 {
    int k=0,limit=0;
    public void backtrack(List<Character> ls,List<Character> ans){
        this.k++;
        if(ans.size()>=this.limit){
            return;
        }
        Set<Character> seen=new HashSet<>();
        for(int i=0;i<ls.size();i++){
            if(!seen.contains(ls.get(i))){
               List<Character> t=new ArrayList<>(ls);
               List<Character> tans=new ArrayList<>(ans);
               t.remove(i);
               tans.add(ls.get(i)); 
               seen.add(ls.get(i));
               backtrack(t,tans);
            }
        }
        
    }
    public int numTilePossibilities(String tiles) {
        List<Character> ls=new ArrayList<>();
        this.limit=tiles.length();
        for(char x : tiles.toCharArray())
                ls.add(x);
        backtrack(ls,new ArrayList<>());
        
        return this.k-1;
    }
}