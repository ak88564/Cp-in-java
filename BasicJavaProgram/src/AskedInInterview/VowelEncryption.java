package AskedInInterview;

/*
Problem Statement  :

There is an encryption game going on. You will be given a number. If a digit is prime, it will take a vowel. Otherwise it will take a consonant value.
By this process, you have to make the string the lexicographically smallest possible. For a given number, print the output as a string.;

Input Format:
An integer n denoting the number.
Output Format:
The encrypted word.

Sample Input: 123421
Sample Output: baecab
 */

import java.util.Scanner;

public class VowelEncryption {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        StringBuilder sb = new StringBuilder();
        String readInput = String.valueOf(n);
        System.out.println(readInput);
        for (int i = 0; i < readInput.length(); i++) {
            if (readInput.charAt(i) == '2'){
                sb.append("a");
            } else if (readInput.charAt(i) == '3') {
                sb.append("e");

            }
            else if (readInput.charAt(i) == '5'){
                sb.append("i");
            } else if (readInput.charAt(i) == '7') {
                sb.append("o");

            } else if (readInput.charAt(i) == '1') {
                sb.append("b");
            } else if (readInput.charAt(i) == '4') {
                sb.append("c");

            } else if (readInput.charAt(i) == '6') {
                sb.append("d");
            } else if (readInput.charAt(i) == '8') {
                sb.append("f");

            } else if (readInput.charAt(i) == '9') {
                sb.append("g");

            }
            else {
                break;
            }
        }
        System.out.println(sb);
    }
}
