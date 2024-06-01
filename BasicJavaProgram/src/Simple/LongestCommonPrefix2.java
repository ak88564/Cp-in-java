package Simple;

import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class LongestCommonPrefix2 {
    public String longestCommonPrefix(String[] strs){
        Arrays.sort(strs);
        String s1 = strs[0];
        String s2 = strs[strs.length-1];
        int indx = 0;
        while(indx<s1.length() && indx<s2.length()){
            if(s1.charAt(indx) == s2.charAt(indx)){
                indx++;
            } else {
                break;
            }
        }
        return s1.substring(0, indx);

    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String arr[] = new String[3];
        for (int i =0; i< arr.length; i++){
            arr[i] = sc.next();
        }
        for (int i =0; i< arr.length; i++){
            System.out.println(arr[i]);
        }

        LongestCommonPrefix obj1 = new LongestCommonPrefix();
        System.out.println("Final Output: " + obj1.longestCommonPrefix(arr));
    }
}
