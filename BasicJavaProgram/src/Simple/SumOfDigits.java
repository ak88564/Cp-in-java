package Simple;

/*
Write a program to input an integer N and print the
sum of all its even digits and all its odd digits separately.

Digits Mean Numbers, Not The Places! If The
Given Integer Is "13245", Even Digits Are 2 & 4, And Odd Digits Are 1, 3 & 5.
 */

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int sum_of_even = 0;
        int sum_of_odd = 0;
        String n = sc.next();
        for(int i=0; i<n.length();i++){
            char value = n.charAt(i);
            int value2 = Character.getNumericValue(value);
            if (value2%2==0){
                sum_of_even = sum_of_even + value2;
            }
            else{
                sum_of_odd = sum_of_odd + value2;
            }
        }
        System.out.print(sum_of_even + " " + sum_of_odd);


    }
}
