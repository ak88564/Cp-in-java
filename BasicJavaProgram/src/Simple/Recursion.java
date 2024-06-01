package Simple;

import java.util.Scanner;

public class Recursion {

    public static int calc(int arr[], int n){
        if(n == 0 ){
            return 0; //c2
        }
        return arr[n-1] + calc(arr, n-1); // O(n) // n
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); //4 bytes
        int arr[] = new int[n]; // n*4 bytes
        for (int i=0; i<n;i++){ //n*4 bytes=> O(n) // n
            arr[i] = sc.nextInt(); // c
        }
        System.out.println(Recursion.calc(arr, n));


    }

}
/*
Space complexity: O(n) + O(n)
Time complexity: O(n)
 */