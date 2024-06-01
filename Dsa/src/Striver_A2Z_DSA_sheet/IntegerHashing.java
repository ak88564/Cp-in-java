package Striver_A2Z_DSA_sheet;

/*
Hashing | Maps | Time Complexity | Collisions | Division Rule of Hashing | Strivers A2Z DSA Course
 */

import java.util.Scanner;

public class IntegerHashing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int[] hash = new int[13];
        for (int i=0;i<n;i++){
            hash[arr[i]] +=1;
        }

        int q;
        System.out.println("Enter number of query");
        q = sc.nextInt();
        while(q-- !=0){
            int number = sc.nextInt();
            System.out.println(hash[number]);
        }

    }
}
