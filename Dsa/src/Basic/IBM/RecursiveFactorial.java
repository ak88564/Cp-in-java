package Basic.IBM;

import java.util.Scanner;

public class RecursiveFactorial {
    static int countFactorial(int n){
        if(n==0){
            return 1;
        }
        return n*countFactorial(n-1);
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(countFactorial(n));

    }
}
