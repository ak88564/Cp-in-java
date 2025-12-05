package AskedInInterview.WissenTechnology;

import java.util.Arrays;

public class SecondLargestNum {
    public static void main(String[] args) {
        int[] arr = new int[]{4,4,4};
        largestNumCalc(arr);
    }
    public static void largestNumCalc(int[] arr){
        int max = Integer.MIN_VALUE;
        int secMax = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++){
            if(max<arr[i]){
                secMax = max;
                max=arr[i];
            }

            if(arr[i]>secMax && arr[i] != max){
                secMax = arr[i];
            }
        }
        System.out.println(secMax);
    }
}
