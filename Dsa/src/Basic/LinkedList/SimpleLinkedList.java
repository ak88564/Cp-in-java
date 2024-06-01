package Basic.LinkedList;

import java.util.LinkedList;

public class SimpleLinkedList {
    public static void main(String args[]){
        LinkedList<String> ll = new LinkedList<String>();
        ll.add("Geeks");
        ll.add("Geeks");
        ll.add(1, "for");

        System.out.println(ll);
    }
}
