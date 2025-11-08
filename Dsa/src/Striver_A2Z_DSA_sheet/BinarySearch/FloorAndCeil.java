package Striver_A2Z_DSA_sheet.BinarySearch;

public class FloorAndCeil {
    public static void main(String[] args) {
        int[] arr = {3, 4, 4, 7, 8, 10};
        System.out.println(floor(arr, 5));
        System.out.println(ceil(arr, 5));
    }

    private static int floor(int[] arr, int target){
        int low = 0;
        int high = arr.length-1;
        int ans = -1;
        while(low<=high){
            int mid = (low+high)/2;
            if(target<arr[mid]){
                high = mid-1;
            }
            else if(target>=arr[mid]){
                ans = arr[mid];
                low=mid+1;
            }
        }
        return ans;
    }

    private static int ceil(int[] arr, int target){
        int low =0;
        int high = arr.length-1;
        int ans = -1;
        while(low<=high){
            int mid =(low+high)/2;
            if(target<=arr[mid]){
                ans = arr[mid];
                high = mid-1;

            }
            else
                low= mid+1;
        }
        return ans;
    }
}
/*
TC: O(log n)
SC: O(1)
 */
