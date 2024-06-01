package Basic;

public class IterativeBinarySearch {
    int binarySearch(int array[], int x, int low, int high){
        //Repeat until the pointers low and high meet each other
        while(high >= low){
            int mid = low + (high-low) / 2;
            if (array[mid] == x){
                return mid;
            }
            if (x > array[mid]){
                low =  mid+1;
            }
            if (x < array[mid]){
                high = mid-1;
            }

        }
        return -1;
    }

    public static void main(String args[]){
        RecursiveBinarySearch ob = new RecursiveBinarySearch();
        int array[] = {3,4,5,6,7,8,9};
        int n= array.length;
        int x =8;
        int result = ob.binarySearch(array, x, 0, n-1);
        if (result == -1){
            System.out.println("Value not found");
        }
        else
            System.out.println("Index of the value is: "+ result);

    }
    }
