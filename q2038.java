import java.util.Stack;

class q2038{
    public boolean winnerOfGame(String colors) {
        // Use a stack to store chars and freq 
        // If count1==count 2 both ) , return false
        // else return (count1-count2>0) true:false
        //count1--> Alice , count2--> Bob
        char chars[]=colors.toCharArray(); 
        char ch ,prev='\0', curr;
        int count1=0,count2=0,freq=0,i=0,n=chars.length;
        Stack<Character> stk=new Stack<>();

        for( i=0;i<n;i++){
            ch=chars[i];
            if(prev!=ch){
                freq=0;
                prev=ch;
            }
            stk.push(ch);
            freq++;
            if(freq==3){
                //pop that char
                curr=stk.pop();
                freq--;
                if(curr=='A')
                    count1++;
                else
                    count2++;
            }
        }
        if(count1==0 && count2==0)
            return false;
        return (count1>count2)? true:false;
    }
}