package Basic.Practice;

import java.util.LinkedList;

public class SingularLinkedList1 {
    public static void main(String args[]){
        LinkedList<String> ll= new LinkedList<String>();
        ll.add("Aditya");
        ll.add("Kumar");
        ll.add(0, "Hello");
        System.out.println(ll);
    }
}
