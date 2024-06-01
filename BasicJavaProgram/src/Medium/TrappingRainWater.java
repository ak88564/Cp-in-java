package Medium;

/*
Given an array of N non-negative integers arr[] representing an elevation map where the width of each bar is 1, compute how much water it is able to trap after raining.

Examples:

Input: arr[] = {2, 0, 2}
Output: 2
Explanation: The structure is like below.
We can trap 2 units of water in the middle gap.

Input: arr[]   = {3, 0, 2, 0, 4}
Output: 7
Explanation: Structure is like below.
We can trap “3 units” of water between 3 and 2,
“1 unit” on top of bar 2 and “3 units” between 2 and 4.
 */

public class TrappingRainWater {

    public static int maxWater(int arr[], int n){
        int res=0;

        for (int i=1;i<n-1;i++){
            int left = arr[i];
            for (int j=0;j<i;j++){
                left=Math.max(left, arr[j]);
            }

            int right = arr[i];
            for (int j=i+1;j<n;j++){
                right=Math.max(right, arr[j]);
            }

            res+=Math.min(left, right)-arr[i];
        }
        return res;

    }
    public static void main(String[] args) {
        int arr[] = {3,0,2,0,4};
        int n= arr.length;

        System.out.print(maxWater(arr, n));
    }
}
