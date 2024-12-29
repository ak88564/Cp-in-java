package AskedInInterview.Factset;

import java.util.Stack;

public class ImplementMinStack {
    Stack<Long> st = new Stack<>();
    Long mini;
    public ImplementMinStack(){
        mini = Long.MAX_VALUE;
    }

    public void push(int value){
        Long val = Long.valueOf(value);
        if (st.isEmpty()){
            mini=val;
            st.push(val);
        }
        else {
            if(val<mini){
                st.push(2*val-mini);
                mini=val;
            } else{
                st.push(val);
            }
        }
    }
    public void pop(){
        if(st.isEmpty()){
            return;
        }
        Long val = st.pop();
        if(val<mini){
            mini = 2*mini - val;
        }
    }

    public int top(){
        Long val = st.peek();
        if(val<mini){
            return mini.intValue();
        }
        return val.intValue();
    }
    public int getMin(){
        return mini.intValue();
    }

    public static void main(String[] args) {

        ImplementMinStack obj1 = new ImplementMinStack();
        obj1.push(6);
        System.out.println(obj1.top());
        obj1.push(3);
        System.out.println(obj1.top());
        obj1.push(11);
        System.out.println(obj1.top());
        obj1.pop();
        System.out.println(obj1.getMin());

    }
}
