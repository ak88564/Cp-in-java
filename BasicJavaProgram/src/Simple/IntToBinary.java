package Simple;

/*
Program to count the number of 1's in a binary value of a number. The number n is taken as a input
from the user.
 */

import java.util.* ;
import java.io.*;
public class IntToBinary {
    public static int countSetBits(int n) {
        // Write your code here.
        int count = 0;
        char ch1;
        String binary_value = Integer.toBinaryString(n);
        for(int i=0;i<binary_value.length();i++){
            ch1 = binary_value.charAt(i);
            int value = Character.getNumericValue(ch1);
            if (value == 1){
                count = count + 1;
            }
        }
        return count;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(countSetBits(n));
    }
}