package Basic.Queue;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class Queue1 {
    public static void main(String args[]){
        Queue<String> pq = new PriorityQueue<>();
        pq.add("geeks");
        pq.add("for");
        pq.add("geeks");

        Iterator iterator = pq.iterator();

        while(iterator.hasNext()){
            System.out.println(iterator.next()+ " ");
        }
    }
}
