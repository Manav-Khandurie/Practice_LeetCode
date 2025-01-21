import java.util.*;
class q331 {
    public boolean isValidSerialization(String preorder) {
        String ch[]=preorder.split(",");
        Stack<String> stk=new Stack<>();
        for(int i=0 ;i<ch.length;i++){
            while(!stk.isEmpty() && stk.peek().equals("#")&& ch[i].equals("#")){
                stk.pop(); // #
                if(stk.isEmpty())  return false;
                stk.pop(); // Number
            }
            stk.push(ch[i]);
        }
        if(stk.size()==1 && stk.peek().equals("#"))
            return true;
        return false;
    }
}