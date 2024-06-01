package Basic.Practice;

import java.util.Scanner;

public class InsertionSort {
    public static void sort(int arr[], int n){
        int i,j,key;
        for (i=0;i<n;i++){
            key= arr[i];
            j=i-1;
            while(j>=0 && key<arr[j]){    // 3,5,9,2,6
                arr[j+1] = arr[j];
                j=j-1;
            }
            arr[j+1] = key;

        }
        for(i=0;i<n;i++){
            System.out.println(arr[i]);
        }

    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i=0;i<n;i++){
            arr[i]= sc.nextInt();

        }
        sort(arr, n);

    }
}
