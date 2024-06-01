package Striver_A2Z_DSA_sheet;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int orgNum = num;
        int count = 0;
        int temp = num;
        while(temp != 0){
            count++;
            temp=temp/10;
        }
        int armStrongNum =0;
        while(num!=0){
            int remainder = num%10;
            armStrongNum += Math.pow(remainder, count);
            num /= 10;
        }

        if (armStrongNum == orgNum)
            System.out.println(armStrongNum + " is armstrong number");
        else System.out.println("Not a armstrong number");
    }
}
