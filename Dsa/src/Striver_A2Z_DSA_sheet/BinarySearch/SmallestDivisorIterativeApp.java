package Striver_A2Z_DSA_sheet.BinarySearch;

import java.util.Arrays;
import java.util.Collections;

public class SmallestDivisorIterativeApp {
    public static void main(String[] args) {
        Integer arr[] = {1,2,3,4,5};
        int limit = 8;
        System.out.println(findSmallestDivisor(arr, limit));
    }
    private static int findSmallestDivisor(Integer[] arr, int limit){
        int largeValue = Collections.max(Arrays.asList(arr));
        for(int i=1;i< largeValue;i++){
            int sum =0;
            for(int j=0;j<arr.length;j++){
                sum+= (int) Math.ceil((double) arr[j]/i);
            }
            if(sum<=limit){
                return i;
            }
        }
        return -1;
    }
}
/*
TC: O(maxVal*n) where, n= array length
SC: O(1)
 */
