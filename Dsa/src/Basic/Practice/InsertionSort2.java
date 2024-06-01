package Basic.Practice;

public class InsertionSort2 {
    public static void insertionSortAlgo(int[] arr){
        for (int i=1;i<arr.length;i++){
            for (int j=i;j>0;j--){
                if (arr[j]<arr[j-1]){
                    swap( arr, j, j-1);
                }
            }
        }
        for (int m:arr
             ) {
            System.out.println(m);

        }
    }
    public static void swap(int[] arr, int large, int small){
        int temp = arr[small];
        System.out.println("Temp index is :" + temp);
        arr[small] = arr[large];
        arr[large] = temp;
    }
    public static void main(String[] args) {
        int[] arr = new int[]{12, 11, 13, 5, 6};


        insertionSortAlgo(arr);
    }
}
