package Striver_A2Z_DSA_sheet;

/*
Hashing | Maps | Time Complexity | Collisions | Division Rule of Hashing | Strivers A2Z DSA Course
 */

import java.util.Scanner;

public class CharacterHashing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str= sc.next();

        int[] hash = new int[26];
        for (int i=0;i<str.length();i++){
            hash[str.charAt(i) - 'a']++;
        }

        System.out.println("Enter the query");
        char ch =sc.next().charAt(0);
        System.out.println(hash[ch - 'a']);

    }
}
