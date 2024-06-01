package Simple;

import java.util.Scanner;

public class ValidParenthesis3 {
    public boolean isValid(String s) {
        int count = 0;

        for (int i = 0; i < s.length()-1; i=i+2) {
            int x = typeDeclaration(s.charAt(i));
            int y = typeDeclaration(s.charAt(i+1));
            System.out.println("Value of first char:" + x);
            System.out.println("Value of second char:" + y);
               if (x!=y){
                   System.out.println("Not equal");
                   count = count + 1;
               }

            }
        if (count > 0){
            return false;
        }
        else return true;
    }
    int typeDeclaration(char ch){
        int num = 0;
        switch (ch){
            case '(':
            case ')':
                num = 1;
                break;
            case '{':
            case '}':
                num = 2;
                break;
            case '[':
            case ']':
                num = 3;
                break;
        }
        return num;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string:");
        String s = sc.next();
        ValidParenthesis3 obj1 = new ValidParenthesis3();
        System.out.println(obj1.isValid(s));


    }
}
