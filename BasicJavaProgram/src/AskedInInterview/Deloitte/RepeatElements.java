package AskedInInterview.Deloitte;

/*
Find repeat elements in an array of strings
Iterate through the array and store each element in a HashMap with its count

Check if the count of any element is greater than 1, then it is a repeat element
 */

import java.util.HashMap;

public class RepeatElements {

    public static void repeatCalc(int[] arr){
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < arr.length; i++){
            if(map.containsKey(arr[i])){
                int value = map.get(arr[i]);
                map.put(arr[i], ++value);
            }
            else{
                map.put(arr[i], 1);
            }
        }
        System.out.println(map);
    }
    public static void main(String[] args) {
        int[] arr = new int[]{1, 1, 1, 2, 4, 8, 1, 8};
        repeatCalc(arr);
    }
}
