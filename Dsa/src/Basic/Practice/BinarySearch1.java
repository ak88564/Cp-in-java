package Basic.Practice;

import java.util.Scanner;

public class BinarySearch1 {

    int binaryCalc(int arr[], int value, int left, int right){
        System.out.println("Function called");
        int mid;
        while(right >= left){
            mid = left + (right - left)/2;
            if(arr[mid] == value){
                return mid;

            }
            if (value<arr[mid]) {
                right = mid-1;
            }
            if(value>arr[mid]){
                left = mid-1;
            }
        }
        return -1;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i=0;i<n;i++){
            System.out.println("Enter value: ");
            arr[i]= sc.nextInt();
        }
        System.out.println("Outside for loop");
        BinarySearch1 obj1 = new BinarySearch1();
        int result = obj1.binaryCalc(arr, 50,0, n-1);
        if (result == -1){
            System.out.println("Not found");
        }
        else {
            System.out.println("Found at index: "+ result)  ;
        }
    }
}
