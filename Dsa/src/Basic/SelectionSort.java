package Basic;

public class SelectionSort {
    void select_sort(int arr[], int n){
        int i, j, min;
        for (i=0;i<n-1;i++){
            min = i;
            for(j=i+1;j<n;j++){
                if(arr[j] < arr[min]){
                    min = j;
//                    System.out.println(j);
                }
            }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
        for (i=0;i<n;i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String args[]){
        int arr[] = {4, 3, 2, 10, 12, 1, 5, 6};
        int n = arr.length;
        SelectionSort obj1 = new SelectionSort();
        obj1.select_sort(arr, n);
    }
}
