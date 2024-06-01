package Striver_A2Z_DSA_sheet;

import java.util.ArrayList;
import java.util.List;

public class MergeSort {
    public static void main(String[] args) {
        int n=7;
        int arr[] = {9,4,7, 6,3,1, 5};
        System.out.println("Before sorting the array");
        for (int i=0; i<n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        MergeSort.mergeSortAlgo(arr, 0, n-1);
        // Prints the final value of the array
        for (int i=0;i<n;i++){
            System.out.print(arr[i] + " ");
        }

    }

    private static void mergeSortAlgo(int[] arr, int low, int high) {
        if (low >= high){
            // As soon as only one element exists in the array, it will return
            return;
        }
        int mid = (low + high)/2;
        mergeSortAlgo(arr, low, mid);
        mergeSortAlgo(arr, mid+1, high);
        merge(arr, low, mid, high); // Performs the merge from the two divided arrays
    }
    private static void merge(int[] arr, int low, int mid, int high){
        List<Integer> temp = new ArrayList<Integer>();
        int left = low;
        int right = mid+1;

        // while loop runs to select the smallest element
        while(left<=mid && right<= high){
            if (arr[left]<=arr[right]){
                temp.add(arr[left]);
                left++;
            }
            else {
                temp.add(arr[right]);
                right++;
            }

        }
        // Any left out element will be added to the temp
        while(left<=mid){
            temp.add(arr[left]);
            left++;
        }
        while(right<=high){
            temp.add(arr[right]);
            right++;
        }


        //Now all elements of the temp will added to the main array
        for (int i=low; i<=high;i++){
            arr[i] = temp.get(i-low);
        }

    }
}
