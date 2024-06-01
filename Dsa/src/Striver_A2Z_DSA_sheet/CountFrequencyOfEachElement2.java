package Striver_A2Z_DSA_sheet;

/*
Using hashmap
 */

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountFrequencyOfEachElement2 {

    static void printFrequency(int[] mainArray){
        
        Map<Integer, Integer> map1 = new HashMap<>();
        for (int i = 0; i < mainArray.length;i++){
            int count=0;
            for (int j=0; j < mainArray.length;j++){
                if (mainArray[i]==mainArray[j]){
                    count++;
                    map1.put(mainArray[i], count);
                }
                
            }
        }

        map1.forEach((k,v) -> System.out.println(k + ": " + v));

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size");
        int size = sc.nextInt();
        int[] mainArray = new int[size];
        for (int i=0;i<size;i++) {
            mainArray[i] = sc.nextInt();
        }
        printFrequency(mainArray);
    }
}
