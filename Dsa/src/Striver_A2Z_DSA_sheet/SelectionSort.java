package Striver_A2Z_DSA_sheet;

import java.util.Scanner;

public class SelectionSort {

    static void selectionSortAlgo(int arr[]){
        for (int i=0; i<arr.length-1; i++){
            int min = i;
            for (int j=i; j<arr.length;j++){
                if (arr[j]<arr[min]){
                    min = j;
                }
            }
            swap(arr, i, min);
        }
        for (int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }

    }

    static void swap(int[] arr, int i, int min ){
        int temp;
        temp = arr[i];
        arr[i] = arr[min];
        arr[min] = temp;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        selectionSortAlgo(arr);
    }
}
