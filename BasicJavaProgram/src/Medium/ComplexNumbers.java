package Medium;

/*
Program to add two complex numbers if choice is 1 or multiply two complex numbers if choice is 2
The solution is a very simple process
 */
import java.util.* ;
import java.io.*;
import java.util.Scanner;

class ComplexNums {
    public static int addReal(int xa, int ya){
        return xa + ya;
    }

    public static int addImaginary(int xb, int yb){
        return xb + yb;
    }

    public static int multiplyReal(int xa, int xb, int ya, int yb){
        return ((xa*ya)-(xb*yb));
    }

    public static int multiplyImaginary(int xa, int xb, int ya, int yb){
        return ((xa*yb)+(xb*ya));
    }

}

class ComplexNumbers {

    public static void main(String args[]) {

        // Write your code here
        Scanner sc = new Scanner(System.in);
        int xa = sc.nextInt();
        int xb = sc.nextInt();

        int ya = sc.nextInt();
        int yb = sc.nextInt();

//        ComplexNums obj1 = new ComplexNums();
//        ComplexNums obj2 = new ComplexNums();

        int choice = sc.nextInt();
        if (choice == 1) {
            int real = ComplexNums.addReal(xa, ya);
            int img = ComplexNums.addImaginary(xb, yb);
            // addReal = ComplexNumbers.addReal(xa, ya);
            System.out.println(real + " " + "+" + " " + "i" + img);
        }
        else {
            int real = ComplexNums.multiplyReal(xa, xb, ya, yb);
            int img = ComplexNums.multiplyImaginary(xa, xb, ya, yb);
            System.out.println(real + " " + "+" + " " + "i" + img);
        }

    }
}

