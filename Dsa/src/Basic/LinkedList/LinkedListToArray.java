package Basic.LinkedList;

import java.util.LinkedList;

public class LinkedListToArray {
    public static void main(String args[]){
        LinkedList<Integer> list = new LinkedList<Integer>();
        list.add(123);
        list.add(12);
        list.add(11);
        list.add(1134);
        System.out.println("LinkedList: "+ list);
        Object[] a = list.toArray();
        System.out.println("After converted linkedlist to array: ");

        //Using for each loop
        for (Object element: a)
            System.out.print(element + " ");
    }
}