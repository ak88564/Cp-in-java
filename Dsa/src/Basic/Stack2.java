package Basic;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

public class Stack2 {
    public static void main(String args[]){
        Deque<Character> stack = new ArrayDeque<Character>();
        Stack<Integer> stack2 = new Stack<Integer>();
        stack.push('A');
        stack.push('B');
        stack.push('C');
        stack2.push(1);
        stack2.push(2);
        stack2.push(3);
        System.out.println(stack.peek());
        System.out.println(stack.pop());
        System.out.println(stack);
        System.out.println(stack2.peek());
        System.out.println(stack2);
    }
}
