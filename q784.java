import java.util.*;
class q784 {

    List<String> ls=new ArrayList<>();

    public void backtrack(char ch[],int i,StringBuilder sb){
        if(i==ch.length){
            ls.add(sb.toString());
            return;
        }
        if(Character.isDigit(ch[i])){
            backtrack(ch,i+1,sb.append(ch[i]));
            sb.deleteCharAt(sb.length()-1);
            return;
        }
        sb.append(Character.toLowerCase(ch[i]));
        backtrack(ch,i+1,sb);
        sb.deleteCharAt(sb.length()-1);
        sb.append(Character.toUpperCase(ch[i]));
        backtrack(ch,i+1,sb);
        sb.deleteCharAt(sb.length()-1);
    }
    public List<String> letterCasePermutation(String s) {
        char ch[]=s.toCharArray();
        backtrack(ch,0,new StringBuilder());
        return this.ls;
    }
}