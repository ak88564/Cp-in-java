package AskedInInterview;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int flag = 0;
        int n = scanner.nextInt();
        if (n==0 || n==1) {
            System.out.println("Not a prime number");
            return;
        }
        int m = n/2;
        for (int i = 2; i <= m; i++) {
            if (n%i==0){
                System.out.println("Not a prime number");
                flag = 1;
                break;
            }
        }
        if (flag==0){
            System.out.println("Prime number");
        }
    }
}
/*
TC: O(n/2)
SC: O(1)
 */
