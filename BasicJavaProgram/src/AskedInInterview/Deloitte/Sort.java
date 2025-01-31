package AskedInInterview.Deloitte;

/*
You have been given an integer array/list(ARR) of size N that contains only integers, 0 and 1. Write a function to sort this array/list.
Think of a solution which scans the array/list only once and don't require use of an extra array/list.
 */

import java.util.Arrays;

public class Sort {

    public static void sort(int[] arr){
        for(int i=0; i<arr.length; i++){
            int length = arr.length-1;
            if(arr[i]>arr[length]){
                swap(arr, i, length);
            }
            length--;
            if (i==length){
                break;
            }
        }
        for (int iter: arr
             ) {
            System.out.print(iter);

        }
    }
    public static void swap(int[] arr, int first, int last){
        System.out.println("First value : " + first + ", Last value : " + last);
        int temp = arr[last];
        arr[last] = arr[first];
        arr[first] = temp;
        System.out.println("First value : " + arr[first] + ", Last value : " + arr[last]);

    }

    public static void main(String[] args) {
        int[] arr = new int[]{1, 0, 1, 1, 0, 1, 1, 0};
        sort(arr);
    }
}
