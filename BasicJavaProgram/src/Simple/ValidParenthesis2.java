package Simple;

import java.util.Scanner;

public class ValidParenthesis2 {
    public boolean isValid(String s){
        int count_for_opening_first = 0;
        int count_for_opening_second = 0;
        int count_for_opening_third = 0;
        int count_for_closing_first = 0;
        int count_for_closing_second = 0;
        int count_for_closing_third = 0;
        for (int i=0;i<s.length();i++){
            if (s.charAt(i) == '('){
                count_for_opening_first = count_for_opening_first + 1;
            }
            else if (s.charAt(i) == '{'){
                count_for_opening_second = count_for_opening_second + 1;
            } else if (s.charAt(i) == '[') {
                count_for_opening_third = count_for_opening_third + 1;

            } else if (s.charAt(i)== ')') {
                count_for_closing_first = count_for_closing_first + 1;

            } else if (s.charAt(i)=='}') {
                count_for_closing_second = count_for_closing_second + 1;

            } else if (s.charAt(i)==']') {
                count_for_closing_third = count_for_closing_third + 1;

            }
            else return false;
        }

        if (count_for_opening_first == count_for_closing_first && count_for_opening_second == count_for_closing_second && count_for_opening_third == count_for_closing_third){
            return true;
        }
        else return false;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string:");
        String s = sc.next();
        ValidParenthesis2 obj1 = new ValidParenthesis2();
        System.out.println(obj1.isValid(s));


    }
}
