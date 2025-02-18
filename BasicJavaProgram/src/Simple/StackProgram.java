package Simple;

import java.util.Iterator;
import java.util.Stack;

public class StackProgram {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<String>();
        stack.add("Welcome");
        stack.add("To");
        stack.add("Geeks");
        stack.add("4");
        stack.add("Geeks");

        Iterator value = stack.iterator();

        while(value.hasNext()){
            System.out.print(value.next());
        }
    }
}
