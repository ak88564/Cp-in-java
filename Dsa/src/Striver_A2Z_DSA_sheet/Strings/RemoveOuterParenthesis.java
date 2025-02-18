package Striver_A2Z_DSA_sheet.Strings;
/*
1021. Remove Outermost Parentheses
Leetcode
 */

public class RemoveOuterParenthesis {
    public static void main(String[] args) {
        String s = new String("(()())(())(()(()))");
        System.out.println(removeFunc(s));
    }
    public static String removeFunc(String s){
        int count = 0;
        StringBuilder str = new StringBuilder();
        int parenthesisCounter = 0;
        int temp = 0; // holds the starting index of the string to be concatenated
        while(count < s.length()){
            if(s.charAt(count)=='('){
                parenthesisCounter++;
            }
            else{
                parenthesisCounter--;
            }

            if (parenthesisCounter==0){
                str.append(s.substring(temp+1, count));
                temp = count +1;
            }
            count++;
        }
        return str.toString();
    }
}
/*
TC: O(n), where n is the length of the string
SC: O(n), where n is the length(size) of the stringbuilder
 */
