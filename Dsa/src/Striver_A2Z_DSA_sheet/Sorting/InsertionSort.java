package Striver_A2Z_DSA_sheet;

public class InsertionSort {
    static void insertionSortAlgo(int[] arr){
        for (int i=1; i<arr.length; i++){
            for(int j=i;j>0;j--){
                if (arr[j-1]>arr[j]){
                    swap(arr, j-1, j);
                }
            }
//            for (int iterator: arr
//            ) {
//                System.out.println(iterator);
//            }

        }
        System.out.println("Final answer: ");
        for (int iterator: arr
             ) {
            System.out.print(iterator + " ");
        }
    }
    static void swap(int[] arr, int a, int b){
        int temp;
        temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
    public static void main(String[] args) {
        int[] arr = new int[]{12, 11, 13, 5, 6};


        insertionSortAlgo(arr);
    }
}
/*
Time: O(N^2)
Space: O(1)
 */
