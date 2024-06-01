package Simple;

import java.util.Scanner;

public class PalindromeNumber {
    public boolean isPalindrome(int x){
        int k = 0;
        int count = 0;

        String num = Integer.toString(x);
        int j= num.length()-1;
        int arr1[] = new int[num.length()];
        for(int i=0;i<num.length();i++){
            char ch = num.charAt(i);
            arr1[i] = ch;
        }
        while (k<num.length()){

            if(arr1[k] == arr1[j]){
                count = count + 1;
                System.out.println(count);
            }
            k = k + 1;
            j = j - 1;
        }

        if (count == num.length())
             return true;
        else return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        PalindromeNumber obj = new PalindromeNumber();
        System.out.println(obj.isPalindrome(x));
    }
}
