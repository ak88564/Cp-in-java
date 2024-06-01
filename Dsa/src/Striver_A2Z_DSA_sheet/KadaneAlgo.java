package Striver_A2Z_DSA_sheet;

// Also known as maximum subarray sum

public class KadaneAlgo {
    public static void main(String[] args) {
        int maxSum = 0;
        int sum = 0;
        int[] arr = new int[]{1,2,7,-4,3,2,-10,9,1};
        for (int i=0;i<arr.length;i++){
            sum = sum + arr[i];
            maxSum = Math.max(maxSum, sum);
            if (sum<0) {
                sum = 0;
            }
        }
        System.out.println(maxSum);
        }
    }
