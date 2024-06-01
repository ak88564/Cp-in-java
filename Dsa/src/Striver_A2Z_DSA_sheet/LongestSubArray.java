package Striver_A2Z_DSA_sheet;

public class LongestSubArray {
    public static void main(String[] args) {
        int[] a = {2, 3, 5, 1, 9};
        long k = 10;
        int len = getLongestSubarray(a, k);
        System.out.println("The length of the longest subarray is: " + len);
    }

    private static int getLongestSubarray(int[] a, long k) {
        int len =0;
        for (int i = 0; i < a.length; i++){
            int s=0;
            for (int j=i;j<a.length;j++){
                s+=a[j];
                if (s==k){
                    len = Math.max(len, j-i+1);
                }
            }
        }
        return len;
    }
}
/*
Time Complexity: O(N2) approx., where N = size of the array.
Reason: We are using two nested loops, each running approximately N times.

Space Complexity: O(1) as we are not using any extra space.
My calculation: O(1) not possible because s+=a[j]
 */
