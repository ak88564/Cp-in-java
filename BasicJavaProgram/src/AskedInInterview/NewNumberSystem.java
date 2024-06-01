package AskedInInterview;

import java.util.Scanner;

public class NewNumberSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(func(str, str.length()-1, 0));
    }
    public static int func(String s, int n, int i){
        if(n<0){
            return 0;
        }
        return (s.charAt(n) - 'a' + 1) * (int) Math.pow(20, i) + func(s, n-1, i+1);
    }
}
