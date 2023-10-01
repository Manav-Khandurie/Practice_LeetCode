import java.util.Stack;

class q739 {
    public int[] dailyTemperatures(int[] arr) {
        int n=arr.length;
        int ans[]=new intq9[n];
        Stack<Integer> stk=new Stack<>(); // store index
        // Do this similar to the next greater problem using Monotonic dec Stack
        stk.add(n-1);ans[n-1]=0;
        int top;
        for(int i=n-2;i>=0;i--){
            top=stk.peek();
            while(!stk.isEmpty()&& arr[top]<=arr[i]){
                stk.pop();
                if(!stk.isEmpty())
                    top=stk.peek();
            }
            if(!stk.isEmpty())
                ans[i]=stk.peek()-i;
            stk.add(i);
        }
        return ans;
    }
}

/*
Input: temperatures = [73,74,75,71,69,72,76,73]
Output: [1,1,4,2,1,1,0,0]

[73,74,75,71,69,72,76,73]*/
 
