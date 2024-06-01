package Basic.IBM;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class KLargestElement {
    private static int kLargest(int[] arr, int element){
        Arrays.sort(arr);
        int[] arr2 = new int[arr.length];
        int j=arr.length-1;
        for (int i=0;i<arr.length;i++){
            arr2[j] = arr[i];
            j--;
        }
        return arr2[element-1];
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr = new int[n];
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the kth largest to be searched"); // ex: 3rd largest
        int k = sc.nextInt();
        int m = kLargest(arr, k);
        System.out.println("Result: "+m);

    }
}
