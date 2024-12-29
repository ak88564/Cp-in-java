package Striver_A2Z_DSA_sheet.Sorting;

import java.util.ArrayList;
import java.util.List;

public class MergeSort {

    public static void merge(int[] arr, int low, int mid, int high){
        int left = low;
        int right = mid+1;
        List<Integer> l1 = new ArrayList<Integer>();
        while(left<=mid && right<=high){
            if (arr[left]<arr[right]) {
                l1.add(arr[left]);
                left++;
            }
            else{
                l1.add(arr[right]);
                right++;
            }

        }
        while(left<=mid){
            l1.add(arr[left]);
            left++;
        }

        while(right<=high){
            l1.add(arr[right]);
            right++;
        }

        for (int i = low; i <= high; i++) {
            arr[i] = l1.get(i - low);
        }

    }
    public static void mergeSort(int[] arr, int low, int high){
        if (low>=high){
            return;
        }
        int mid = (low + high)/2;
        mergeSort(arr, low, mid);
        mergeSort(arr, mid+1, high);
        merge(arr, low, mid, high);

    }
    public static void main(String[] args) {
        int n=7;
        int arr[]={9,4,7,6,3,1,5};
        System.out.println("Before sorting array:");
        for(int i=0;i<n;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        mergeSort(arr, 0, n-1);
        System.out.println("After sorting array:");
        for(int i=0;i<n;i++){
            System.out.print(arr[i] + " ");
        }
    }
}
