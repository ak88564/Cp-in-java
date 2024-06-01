package Medium;

/*
Program to add two complex numbers if choice is 1 or multiply two complex numbers if choice is 2
The parameterized constructor is mandatory for this solution
 */

import java.util.Scanner;

class func1 {

    int real;
    int imaginary;

    public func1(int real, int imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public void plus(func1 c) {
        int real = this.real + c.real;
        int imaginary = this.imaginary + c.imaginary;
        this.real = real;
        this.imaginary = imaginary;
    }

    public void multiply(func1 c) {
        int real = (this.real * c.real) - (this.imaginary * c.imaginary);
        int imaginary = (this.real * c.imaginary) + (this.imaginary * c.real);
        this.real = real;
        this.imaginary = imaginary;
    }

    public void print() {
        System.out.print(this.real + " + " + "i" + this.imaginary);
    }

}

class ComplexNumbers2 {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int real1, imaginary1, real2, imaginary2;
        real1 = sc.nextInt();
        imaginary1 = sc.nextInt();
        real2 = sc.nextInt();
        imaginary2 = sc.nextInt();

        func1 c1 = new func1(real1, imaginary1);
        func1 c2 = new func1(real2, imaginary2);

        int choice = sc.nextInt();
        if (choice == 1) {
            c1.plus(c2);
            c1.print();
        } else if (choice == 2) {
            c1.multiply(c2);
            c1.print();
        }

    }
}

