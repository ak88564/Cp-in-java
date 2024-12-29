package AskedInInterview.Factset;

/*
Find a pair which have a given sum in a given array
 */

import java.lang.reflect.Array;

public class FindPairSum {
    static int[] findSum(int[] arr, int target){
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                int sum = arr[i]+arr[j];
                if(sum==target){
                    return new int[]{arr[i], arr[j]};
                }
            }
        }
        return new int[]{0,0};
    }
    public static void main(String[] args) {
        int[] arr = new int[]{2, 5, 7, 10, 34, 6, 11};
        int target = 40;
        int[] result = findSum(arr, target);
        for (int i: result
             ) {
            System.out.println(i);
        }
    }
}
