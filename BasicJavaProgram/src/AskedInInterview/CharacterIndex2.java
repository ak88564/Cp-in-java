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

public class CharacterIndex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String var1 = sc.next();
        System.out.printf("Input string is: %s",  var1);

        CharacterIndex2 obj1 = new CharacterIndex2();
        System.out.println("Index is: " + obj1.filterChar(var1));
    }
    public int filterChar(String str){
        for(int i=0;i<str.length()-1;i++) {
            char charHolder = str.charAt(i);
            if (Character.isLowerCase(charHolder)){
                for (int j=i+1;j<str.length();j++) {
                    if (charHolder == str.charAt(j)){
                        break;
                    }
                    if (j==str.length()-1){
                        System.out.println("Found at index: " + i);
                        return i;
                    }

                }

            }
        }
        return -1;
    }
}
