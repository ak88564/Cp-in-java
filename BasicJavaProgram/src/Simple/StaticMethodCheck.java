package Simple;

import java.util.Scanner;

public class StaticMethodCheck {
    public static int firstMethod(long a , long b){
        long sum = a+b;
        anotherMethod(sum);
        return (int) sum;

    }
    public static void anotherMethod(long sum){
        System.out.println("This is an another method" + sum);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        System.out.println(StaticMethodCheck.firstMethod(a, b));
    }
}
