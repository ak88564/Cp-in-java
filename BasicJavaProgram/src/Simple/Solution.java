package Simple;

/*Write a program to calculate the total salary of a
//person. The user has to enter the basic salary (an
//integer) and the grade (an uppercase character),
//and depending upon which the total salary is
//calculated as -
//totalSalary = basic + hra + da + allow - pf */

/*
hra = 20% of basic
da= 50% of basic
allow = 1700 if grade = 'A'
allow = 1500 if grade = 'B'
allow = 1300 if grade = 'C' or any other character
pf= 11% of basic.
 */

import java.util.* ;
import java.io.*;

class Solution {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int allow;
        int basic = sc.nextInt();
        char grade = sc.next().charAt(0);

        //Alternate method to calculate %age
        // float hra = (basic*(20.0f/100.0f));
        // float da = (basic*(50.0f/100.0f));
        // float pf = (basic*(11.0f/100.0f));
        double hra = 0.2 * basic;
        double da = 0.5 * basic;
        double pf = 0.11 * basic;
        System.out.println(hra + " " + da + " " + pf);

        if (grade=='A'){
            allow=1700;
        }
        else if(grade=='B'){
            allow=1500;
        }
        else{
            allow=1300;
        }
        System.out.println(allow);


        double totalSalary = basic+hra+da+allow-pf;
        System.out.println(totalSalary);
        System.out.println(Math.round(totalSalary));
    }
}