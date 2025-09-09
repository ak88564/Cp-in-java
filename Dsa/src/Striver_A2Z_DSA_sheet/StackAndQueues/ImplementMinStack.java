package Striver_A2Z_DSA_sheet.StackAndQueues;

import java.util.Stack;

public class ImplementMinStack {

    Stack<Long> st = new Stack<>();
    Long mini;

    public ImplementMinStack(){
        mini = Long.MAX_VALUE;
    }

    public void push(int val){
        Long value = Long.valueOf(val);
        if(st.isEmpty()){
            st.push(value);
            mini = value;
        }
        else{
            if(value<mini){
                st.push(2*value - mini);
                mini = value;
            }
            else{
                st.push(value);
            }
        }
    }

    public void pop(){
        if(st.isEmpty()){
            return;
        }
        Long value = st.pop();
        if(value<mini){
            mini = 2*mini - value;
        }
    }

    public int top(){
        Long value = st.peek();
        if(value<mini){
            return mini.intValue();
        }
        return value.intValue();
    }

    public int getMin(){
        return mini.intValue();
    }
    public static void main(String[] args) {
        ImplementMinStack obj1 = new ImplementMinStack();
        obj1.push(20);
        obj1.push(30);
        obj1.push(40);
        obj1.push(6);
        obj1.push(50);
        System.out.println(obj1.top());
        obj1.pop();
        System.out.println(obj1.top());
        System.out.println(obj1.getMin());


    }
}
