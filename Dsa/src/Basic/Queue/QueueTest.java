package Basic.Queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueTest {
    public static void main(String[] args) {
        Queue<Integer> queue1 = new LinkedList<>();
        queue1.add(10);
        int size = queue1.size();
        System.out.println(size);
        queue1.add(20);
        queue1.add(30);
        queue1.add(40);
        queue1.add(50);

        System.out.println("Queue: " + queue1);
        System.out.println(queue1.getClass());
        System.out.println(size);
    }
}
