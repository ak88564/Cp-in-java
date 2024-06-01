package Basic;

import java.util.Scanner;

public class StringPalindrome {
    static boolean isPalindrome(String str) {
        int n = str.length();
        int i = 0;

        while (i < n) {
            char ch1 = str.charAt(i);
            char ch2 = str.charAt(n-1);
            if (ch1!=ch2){
                return false;
            }
            n--;
            i++;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        if(isPalindrome(str)){
            System.out.println("Palindrome");
        }
        else
            System.out.println("Not a palindrome");

    }
}
/*
TC: O(n)
SC: O(n), where n is the length of the input string
 */

