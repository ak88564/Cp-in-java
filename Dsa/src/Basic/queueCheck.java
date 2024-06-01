package Basic;

import java.util.LinkedList;
import java.util.Queue;

public class queueCheck {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        queue.add("apple");
        queue.add("orange");
        System.out.println(queue);
        String peeked = queue.peek();
        System.out.println(peeked);
        System.out.println(queue);
    }
}
