package Basic;

public class InsertionSort {
    void sort(int arr[], int n){
        int i,key,j;
        for(i=1;i<n;i++){
            key = arr[i];
            j = i-1;
            while(j>=0 && arr[j]>key){ // Moving of elements
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
        int arr[] = {50, 40, 30, 70, 90, 10, 20, 60, 80, 100};
        int n = arr.length;
        InsertionSort obj = new InsertionSort();
        obj.sort(arr, n);

    }
}
