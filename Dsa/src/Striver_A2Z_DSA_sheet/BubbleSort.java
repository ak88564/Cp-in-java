package Striver_A2Z_DSA_sheet;

import java.util.Scanner;

public class BubbleSort {
    static void bubbleSortAlgo(int[] arr){
        for (int i=arr.length-1; i>=1; i--){
            for (int j=0;j<i;j++){
                if (arr[j+1]<arr[j]){
                    swap(arr, j+1, j);
                }
            }
            for (int iterator:arr
                 ) {
                System.out.print(iterator + " ");

            };
        }
    }
    static void swap(int[] arr, int a, int b){
        int temp;
        temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }
        bubbleSortAlgo(arr);
    }
}
