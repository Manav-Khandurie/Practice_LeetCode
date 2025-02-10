import java.util.*;
class q3174 {
    public String clearDigits(String s) {
        StringBuilder sb=new StringBuilder();
        Stack<Character> stk=new Stack<>();
        for(char x: s.toCharArray()){
            if(Character.isDigit(x) && !stk.isEmpty()){
                stk.pop();
                continue;
            }
            stk.push(x);
        }
        while(!stk.isEmpty())
            sb.append(stk.pop());
        return sb.reverse().toString();
    }
}