package Collection;

import java.util.LinkedList;
import java.util.List;

public class linkedList {
    public static void main(String args[]){
        LinkedList<String> list1= new LinkedList<String>();
        list1.add("CN");
        list1.add("For");
        list1.add("CN");
        list1.add("CodingNinjas");
        list1.add("Code");

        List<String> list2 = new LinkedList<>();
        list2.add("CN");

        list1.removeAll(list2);

        for (String temp: list1)
            System.out.printf(temp + " ");
        System.out.println();
    }
}
