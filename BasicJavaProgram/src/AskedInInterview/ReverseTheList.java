package AskedInInterview;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReverseTheList {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<String>();
        list1.add("Aditya");
        list1.add("India");
        list1.add("Ramesh");
        Collections.reverse(list1);
        System.out.println(list1.toString());

        List<String> list2 = new ArrayList<String>();
        for (int i=list1.size()-1;i>=0;i--){
            list2.add(list1.get(i));
        }
        System.out.println(list2.toString());
    }
}
