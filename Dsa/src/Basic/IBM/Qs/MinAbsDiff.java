package Basic.IBM.Qs;

/*
Given an array of distinct integers, determine the minimum absolute difference between any two elements.
Print all element pairs with that difference in ascending order.

 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class MinAbsDiff {

    static void closestNumbers(List<Integer> numbers){
        int minDiff = Integer.MAX_VALUE;
        Collections.sort(numbers);
        List<String> resultHolder = new ArrayList<String>();
        for (int i =0;i<numbers.size()-1;i++){
            int diff = numbers.get(i+1) - numbers.get(i);
            if (diff< minDiff){
                minDiff =diff;
                resultHolder.clear();
                resultHolder.add(numbers.get(i) + " " + numbers.get(i+1));
            }
            else if (diff == minDiff) {
                resultHolder.add(numbers.get(i) + " " + numbers.get(i + 1));
            }
        }

        for (String i:resultHolder
             ) {
            System.out.println(i);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> numbers = new ArrayList<Integer>();
        numbers.add(4);
        numbers.add(2);
        numbers.add(1);
        numbers.add(3);

        closestNumbers(numbers);
    }
}
