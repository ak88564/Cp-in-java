package Basic.Practice;

import java.util.Scanner;

public class SelectionSort {
    void selectSortFunc(int arr[], int n){
        int min,i,j;

        for(i=0;i<n-1;i++){
            min = i; //passing the index value
            for(j=i+1;j<n;j++){
                if (arr[j]<arr[min]){
                    min = j;
                }
            }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i]=temp;
        }
        for (i=0;i<n;i++){
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
        SelectionSort obj = new SelectionSort();
        obj.selectSortFunc(arr, n);

    }
}
