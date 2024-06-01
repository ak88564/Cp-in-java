package Basic.Practice;

public class BubbleSort {
    public static void bubbleSortAlgo(int[] arr){
        for (int i=arr.length-1; i>=1;i--){
            for (int j=0;j<i;j++){
                if (arr[j]>arr[j+1]){
                    swap(arr, j, j+1);
                }
            }
        }
        for (int m: arr) {
            System.out.print(m + " ");

        }

    }
    public static void swap(int[] arr, int first, int last ){
        int temp = arr[first];
        arr[first] = arr[last];
        arr[last] = temp;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{12, 11, 13, 5, 6};


        bubbleSortAlgo(arr);
    }
}
