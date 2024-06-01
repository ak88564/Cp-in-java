package Basic.Practice;

import java.util.Collections;
import java.util.Scanner;

public class BinarySearch2 {
    int calcSearch(int arr[], int x, int left, int right){
        while (right>=left){
            int mid = left+(right-left)/2;
            if (arr[mid]==x){
                return mid;
            }
            if (x<arr[mid]){
                right = mid;
            }
            if (x>arr[mid]){
                left=mid;
            }
        }
        return -1;

    }
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int ar1[] = new int[n];
        for (int i=0;i<n;i++){
            ar1[i]= sc.nextInt();
        }
        BinarySearch2 obj = new BinarySearch2();
        int x=20;
        int result = obj.calcSearch(ar1, x, 0,n-1);
        if (result ==-1){
            System.out.println("Not found");
        }
        else System.out.println("found at index: " +  result);
    }
}
