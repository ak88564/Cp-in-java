package Basic;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class TwoPointerApproach {
    static void twoPointer(List<Integer> list, int value) {
        int i=0;
        int j=list.size() - 1;
//        System.out.println(j);
//        for(i=0;i< list.size();i++){
//            for (j=n;j>=0;j--){
        while (i < j) {
            if (list.get(i) + list.get(j) == value) {
                System.out.println("Found at " + i + " " + j + " " + "index");
                break;
            } else if (list.get(i) + list.get(j) < value) {
                i++;

            } else j--;
        }
        System.out.println("Not found");
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int value = 10;
        List<Integer> list1 = new ArrayList<Integer>();
        for (int i=0;i< 3;i++){
            System.out.println("Enter the value to insert");
            int temp = sc.nextInt();
            list1.add(temp);
        }
        System.out.println(list1.getClass());
        System.out.println("Inserted value is: " + list1);

        // Sorting
        Collections.sort(list1);
        System.out.println("Sorted list: " + list1) ;

        twoPointer(list1, value);

    }
}
