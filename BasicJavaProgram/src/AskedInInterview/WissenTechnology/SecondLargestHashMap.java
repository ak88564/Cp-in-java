package AskedInInterview.WissenTechnology;
/*
Java program to find out the second largest number from the array through hashmap
map

Program don't work(problem with the logic)
 */

import java.util.HashMap;
import java.util.Map;

public class SecondLargestHashMap {
    public static void main(String[] args) {
        int[] arr = new int[]{4,4,4, 9, 8};
    }
    public static void findSecondLargest(int[] arr){
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        int iterator =0;
        int size = arr.length;
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            if(entry.getKey() != arr[iterator]){
                map.put(size, arr[iterator]);
                size-=1;
                break;
            }
        }
    }
}
