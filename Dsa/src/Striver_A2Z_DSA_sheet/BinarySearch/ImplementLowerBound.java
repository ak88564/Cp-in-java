package Striver_A2Z_DSA_sheet.BinarySearch;

public class ImplementLowerBound {
    public static void main(String[] args) {
        int[] arr = new int[] {3, 5, 8, 15, 19};
        int target = 9;
        System.out.println(lowerBoundFilter(arr, target));

    }
    private static int lowerBoundFilter(int[] arr, int target){
        // returns index of the array
        int low =0;
        int high = arr.length-1;
        int ans = 0;
        while(low<=high){
            int mid = (low+high)/2;
            if(arr[mid]>= target){
                // target
                ans = mid;
                high = mid-1;
            }
            else {
                low = mid + 1;
            }
        }
        return ans;
    }
}
