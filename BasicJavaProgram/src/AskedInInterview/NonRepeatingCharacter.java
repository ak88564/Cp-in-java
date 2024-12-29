package AskedInInterview;
/*
Write a function that takes in a string and returns the first non-repeating character in the string. If no
such character exists, the function should return null.

For ex, given the string "abacbcd", the function should return "d", since, it is the first character
that appears only once in the string.
 */

public class NonRepeatingCharacter {
    public static char firstNonRepeatingCharacter(String str){
        for(int i=0;i<str.length();i++){
            int count  =0;
            for(int j=0;j<str.length();j++){
                if(i==j){
                    System.out.println("Continue executed" + i + " " + j);
                    continue;
                }
                if(str.charAt(i) == str.charAt(j)){
                    count++;
                }
            }
            if(count==0){
                return str.charAt(i);
            }

        }
        return '\0';
    }
    public static void main(String[] args) {
        String str = "abaccdad";
        System.out.println(firstNonRepeatingCharacter(str));
    }
}
