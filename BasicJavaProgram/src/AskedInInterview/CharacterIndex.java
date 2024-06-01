package AskedInInterview;

/*
Write a function that takes in a string of lower case english alphabet letters and returns the index of the
string's first non repeating character.

The first non repeating character is the first character in the string that occurs only once.
If the input string does not have a repeating character, the function should return -1.

example:
input: abcdcaf
output: 1
 */

import java.util.Scanner;

public class CharacterIndex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String var1 = sc.next();
        System.out.println("Input string is: " + var1);
        for(int i=0;i<var1.length()-1;i++) {
            char charHolder = var1.charAt(i);
            if (Character.isLowerCase(charHolder)){
                for (int j=i+1;j<var1.length();j++) {
                    if (charHolder == var1.charAt(j)){
                        break;
                    }
                    if (j==var1.length()-1){
                        System.out.println("Found at index: " + i);
                        return;
                    }

                }

            }
        }
        System.out.println("Not found");
    }
}
