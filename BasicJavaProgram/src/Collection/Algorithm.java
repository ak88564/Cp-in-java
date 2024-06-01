package Collection;

import java.util.*;

public class Algorithm {
    public static void main(String args[]){
        //Create and initialize Array List
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(-4);
        list.add(21);
        list.add(-21);
        list.add(4);
        System.out.println("Original list:");
        System.out.println(list);

        //Create a reverse order comparator
        Comparator r = Collections.reverseOrder();

        //Sort list by using the comparator
        Collections.sort(list, r);

        //Get iterator
        Iterator li = list.iterator();
        System.out.print("List sorted order in reverse: ");

        while(li.hasNext()) {
            System.out.print(li.next() + " ");
        }
        System.out.println();

        Collections.shuffle(list);
        li=list.iterator();
        System.out.print("List shuffled: ");

        while (li.hasNext()) {
            System.out.print(li.next() + " ");
        }
        System.out.println();
        System.out.println("Minimum: " + Collections.min(list));
        System.out.println("maximum: " + Collections.max(list));
    }
}
