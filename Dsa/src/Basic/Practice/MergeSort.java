package Basic.Practice;

import java.util.ArrayList;

public class MergeSort {
    public static void main(String[] args) {
        int n=7;
        int arr[] = {9,4,7, 6,3,1, 5};
        mergeSort(arr,0 , n-1);
        for (int m: arr) {
            System.out.print(m + " ");
        }
    }

    private static void mergeSort(int[] arr, int low, int high) {
        if (low>=high){
            return;
        }
        int mid = (low+high)/2;
        mergeSort(arr, low, mid);
        mergeSort(arr, mid+1, high);
        merge(arr, low, mid, high);
    }
    private static void merge(int[] arr, int low, int mid, int high){
        // declare an arraylist to hold the sorted values
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        int left = low;
        int right = mid+1;
        while(left<=mid && right<=high){
            if (arr[left]<=arr[right]){
                list1.add(arr[left]);
                left++;
            }
            else {
                list1.add(arr[right]);
                right++;
            }
        }
        while (left<=mid){
            list1.add(arr[left]);
            left++;
        }

        while (right<=high){
            list1.add(arr[right]);
            right++;
        }
//        System.out.println("List values below");
//        System.out.println(list1);

        for (int i=low;i<=high;i++) {
            arr[i] = list1.get(i-low);
        }
//        System.out.println(list1);
    }
}
