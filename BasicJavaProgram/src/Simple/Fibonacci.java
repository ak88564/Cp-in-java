package Simple;

import java.util.* ;

/*
Fibonacci series by recursive method
 */

public class Fibonacci {
    public static int fibonacciNumber(int n) {
        int mod = (int) 1e9 + 7;

        // Base Case.
        if (n <= 1){
            return n;
        }

        // Recursive call.
        return (fibonacciNumber(n - 1) + fibonacciNumber(n - 2)) % mod;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(Fibonacci.fibonacciNumber(n));
    }

}