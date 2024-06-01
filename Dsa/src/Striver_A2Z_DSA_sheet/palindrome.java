package Striver_A2Z_DSA_sheet;

import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int value = sc.nextInt();
        int dummy = value;
        int reverse = 0;
        while(dummy!=0){
            int remainder = dummy%10;
            reverse = reverse*10+remainder;

            dummy = dummy/10;
        }
        System.out.println(reverse);
        if (value==reverse){
            System.out.println("Palindrome");

        }
        else
            System.out.println("Not a Palindrome");
    }
}
