package Simple;

import java.util.Scanner;

// Java program that prints fibonacci series till the passed index number
// One drawback of this method, we cannot pass large index number

class driver{
    void functionHolder(int firstNum, int secondNum, int index){
        while (index>2) {

            int sum = firstNum + secondNum;
            System.out.print(sum + " ");
            firstNum = secondNum;
            secondNum = sum;
            index = index - 1;
        }

    }
}

public class Fibonacci2 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int firstNum = 0;
        int secondNum = 1;
        System.out.println("Enter the index number");
        int input = sc.nextInt();
        if (input==0){
            System.out.println(firstNum);
        } else if (input==1) {
            System.out.println(secondNum);
        }
        else {
            driver obj1 = new driver();
            System.out.print(0 + " " + 1 + " ");
            obj1.functionHolder(firstNum, secondNum, input);

        }

    }
}
