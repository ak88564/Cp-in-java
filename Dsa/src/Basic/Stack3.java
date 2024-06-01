package Basic;


import java.util.Stack;

class function_holder{
    static void addData(Stack<Integer> stack, int data){
        stack.push(data);
    }
    static void removeData(Stack<Integer> stack){
        stack.pop();
    }
    static void dispay(Stack<Integer> stack){
        System.out.println(stack);
    }
}
public class Stack3 {
    public static void main(String args[]){
        Stack<Integer> stack1 = new Stack<Integer>();
        function_holder.addData(stack1, 110);
        function_holder.addData(stack1, 120);
        function_holder.addData(stack1, 130);
        function_holder.removeData(stack1);
        function_holder.dispay(stack1);


    }
}
