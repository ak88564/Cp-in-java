package Simple;

import java.util.Scanner;

public class ValidParenthesis {
    public boolean isValid(String s){
        int count_for_opening = 0;
        int count_for_closing = 0;
        for (int i=0;i<s.length();i++){
            if (s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '['){
                count_for_opening = count_for_opening + 1;
            }
            if (s.charAt(i) == ')' || s.charAt(i) == '}' || s.charAt(i) == ']'){
                count_for_closing = count_for_closing + 1;
            }

        }
        if(count_for_opening == count_for_closing){
            return true;
        }
        else return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string:");
        String s = sc.next();
        ValidParenthesis obj1 = new ValidParenthesis();
        System.out.println(obj1.isValid(s));


    }
}
