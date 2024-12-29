package LtiMindTree;
/*
Count the occurrence of any 1 character in a string
 */

public class CountChars {
    public static int countCharsString(String str, char c){
        int count = 1;
        for(int i=0; i<str.length();i++){
            if(str.charAt(i)==c){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        String str = new String("Aditya");
        char ch = 'a';
        System.out.println(countCharsString(str, ch));
    }
}
