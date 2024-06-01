package Simple;

import java.util.* ;
import java.io.*;

public class FibonacciForSmallNumbers{
    public static int fibonacciNumber(int n){
        // Write your code here.
        int first = 0;
        int second = 1;
        int sum =0;
        int mod = (int) 1e9 + 7;
        if (n == 1){
            return 1;
        }
        else{
            for(long i=1;i<n;i++){
                sum = first+second;
                first=second;
                second=sum;

            }
            return (sum) % mod;
        }

    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(Fibonacci.fibonacciNumber(n));
    }
}