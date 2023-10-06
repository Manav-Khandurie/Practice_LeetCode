import java.util.ArrayList;

class q706 {
    ArrayList<Integer> key;ArrayList<Integer> value;
    public q706() {
        this.key=new ArrayList<>();
        this.value=new ArrayList<>();
    }
    
    public void put(int key, int value) {
        int u=0;
        for( int k : this.key){

            if(k==key){
                //At index u

                this.value.remove(u);
                this.value.add(u,value);
                return;
            }
            u++;
        }
        this.key.add(key);
        this.value.add(value);
    }
    
    public int get(int key) {
        int pos=this.key.indexOf(key);
        if(pos==-1)
            return -1;
        return this.value.get(pos);
    }
    
    public void remove(int key) {
        int ele;
        for(int i=0;i<this.key.size();i++){
            ele=this.key.get(i);
            if(key==ele){
                this.key.remove(Integer.valueOf(ele));
                this.value.remove(i);
            }
        }
    }
}
/*
Runtime
Details
275ms
Beats 10.33%of users with Java

Memory
Details
46.66MB
Beats 81.07%of users with Java
 */
/*

Q706. Design HashMap

Design a HashMap without using any built-in hash table libraries.

Implement the MyHashMap class:

MyHashMap() initializes the object with an empty map.
void put(int key, int value) inserts a (key, value) pair into the HashMap. If the key already exists in the map, update the corresponding value.
int get(int key) returns the value to which the specified key is mapped, or -1 if this map contains no mapping for the key.
void remove(key) removes the key and its corresponding value if the map contains the mapping for the key.
 

Example 1:

Input
["MyHashMap", "put", "put", "get", "get", "put", "get", "remove", "get"]
[[], [1, 1], [2, 2], [1], [3], [2, 1], [2], [2], [2]]
Output
[null, null, null, 1, -1, null, 1, null, -1]

Explanation
MyHashMap myHashMap = new MyHashMap();
myHashMap.put(1, 1); // The map is now [[1,1]]
myHashMap.put(2, 2); // The map is now [[1,1], [2,2]]
myHashMap.get(1);    // return 1, The map is now [[1,1], [2,2]]
myHashMap.get(3);    // return -1 (i.e., not found), The map is now [[1,1], [2,2]]
myHashMap.put(2, 1); // The map is now [[1,1], [2,1]] (i.e., update the existing value)
myHashMap.get(2);    // return 1, The map is now [[1,1], [2,1]]
myHashMap.remove(2); // remove the mapping for 2, The map is now [[1,1]]
myHashMap.get(2);    // return -1 (i.e., not found), The map is now [[1,1]]
 

Constraints:

0 <= key, value <= 106
At most 104 calls will be made to put, get, and remove.
 */
/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */
 /*

 ["MyHashMap","remove","get","put","put","put","get","put","put","put","put"]

 ["MyHashMap","put", "put","get","get","put","get","remove","get"]
[    [],       [1,1],[2,2],[1],   [3], [2,1], [2],  [2],     [2]]
[    null,      null, null,  1,   -1,   null,  2,   null,    2]

[    null,      null, null,  1,   -1,   null,  1,   null,    -1]
*/