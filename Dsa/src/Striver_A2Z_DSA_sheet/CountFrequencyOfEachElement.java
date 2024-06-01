package Striver_A2Z_DSA_sheet;

/*
Using loops
 */

import java.util.Scanner;

public class CountFrequencyOfEachElement {

    static void printFrequency(int[] mainArray){

        boolean[] recordHolder = new boolean[mainArray.length];

        // Iterate over the main array
        for(int i=0;i<mainArray.length;i++){
            int count = 0;
            System.out.println("Current value is " + recordHolder[i]);
            if (!recordHolder[i]){
                for (int j=0;j<recordHolder.length;j++){
                    if(mainArray[i]== mainArray[j]){
                        count++;
                        recordHolder[j] = true;
                    }
                }
                System.out.println("Frequency of " + mainArray[i] +" is " + count);
            }

        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size");
        int size = sc.nextInt();
        int[] mainArray = new int[size];
        for (int i=0;i<size;i++){
            mainArray[i] = sc.nextInt();

        }
        printFrequency(mainArray);

    }
}
// Time complexity: O(N^2)
