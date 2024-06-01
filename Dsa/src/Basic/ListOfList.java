package Basic;

import java.util.ArrayList;
import java.util.List;

public class ListOfList {
    public static void main(String[] args) {
        List<List<Integer>> list = new ArrayList();
        List<Integer> list2 = new ArrayList();
        list2.add(10);
        list.add(list2);
        System.out.println(list);
    }
}
