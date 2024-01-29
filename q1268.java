import java.util.*;
class q1268 {

    class TrieNode{
        Map<Character,TrieNode> children;
        boolean isEnd;
        TrieNode(){
            children=new HashMap<>();
            isEnd=false;
        }
    }

    TrieNode root=new TrieNode();
    PriorityQueue<String> minheap;

    public void insert(String word){
        char ch[]=word.toCharArray();
        TrieNode curr=root;
        for(char c : ch){
            if(!curr.children.containsKey(c))
                curr.children.put(c,new TrieNode());
            curr=curr.children.get(c);
        }
        curr.isEnd=true;
    }

    public List<String> getSuggestion(String word){
        
        //Define a pq
        //System.out.println("~~"+word);
        minheap=new PriorityQueue<>((w1,w2)->w2.compareTo(w1));
        //lexigraphically lesser has higher priority


        List<String> ls=new ArrayList<>();
        TrieNode curr=root;
        char ch[]=word.toCharArray();


        for(char c:ch){
            //If we didnt get the char i.ee no word can be suggest simply return ls
            if(!curr.children.containsKey(c)){
                System.out.println("Trie hard");
                return ls;
            }
            curr=curr.children.get(c);
        }
        if(curr.isEnd)
            minheap.offer(word);
        //Now curr points to our words
        //Explore all the children of the curr

        for(char c : curr.children.keySet()){
            String t=new String(word);
            dfs(curr.children.get(c),t+c);
        }

        while(minheap.size()>3)
            minheap.poll();
        //System.out.println(minheap);
        
        while(!minheap.isEmpty())
            ls.addFirst(minheap.poll());

        minheap=null;
        
        return ls;

    }
    public void dfs(TrieNode curr,String word){

        if(curr.isEnd){
            minheap.offer(word);
        }
        for(char c : curr.children.keySet()){
            String t=new String(word);
            t+=c;
            dfs(curr.children.get(c),t);
        }
    }
    public List<List<String>> suggestedProducts(String[] products, String searchWord) {
        List<List<String>> lst=new ArrayList<>();

        //Insert words to trie
        for(String t : products)
            insert(t);
        
        for(int i=1;i<=searchWord.length();i++){
            List<String> ls=getSuggestion(searchWord.substring(0,i));
            lst.add(ls);
        }
        return lst;
    }
}
/*
Q1268. Search Suggestions System

You are given an array of strings products and a string searchWord.

Design a system that suggests at most three product names from products after each character of searchWord is typed. Suggested products should have common prefix with searchWord. If there are more than three products with a common prefix return the three lexicographically minimums products.

Return a list of lists of the suggested products after each character of searchWord is typed.

 

Example 1:

Input: products = ["mobile","mouse","moneypot","monitor","mousepad"], searchWord = "mouse"
Output: [["mobile","moneypot","monitor"],["mobile","moneypot","monitor"],["mouse","mousepad"],["mouse","mousepad"],["mouse","mousepad"]]
Explanation: products sorted lexicographically = ["mobile","moneypot","monitor","mouse","mousepad"].
After typing m and mo all products match and we show user ["mobile","moneypot","monitor"].
After typing mou, mous and mouse the system suggests ["mouse","mousepad"].
Example 2:

Input: products = ["havana"], searchWord = "havana"
Output: [["havana"],["havana"],["havana"],["havana"],["havana"],["havana"]]
Explanation: The only word "havana" will be always suggested while typing the search word.
 

Constraints:

1 <= products.length <= 1000
1 <= products[i].length <= 3000
1 <= sum(products[i].length) <= 2 * 104
All the strings of products are unique.
products[i] consists of lowercase English letters.
1 <= searchWord.length <= 1000
searchWord consists of lowercase English letters.
*/
/*
Runtime
306ms Beats 5.07% of users with Java

Memory
55.70MB Beats 5.22% of users with Java
*/