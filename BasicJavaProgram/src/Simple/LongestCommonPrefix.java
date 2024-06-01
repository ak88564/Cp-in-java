package Simple;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs){
        int count = 0;
        int size = strs.length;
        String holder = "";

        if (!Objects.equals(strs[0], "") && size>1) {
            int value = longestSelection(strs);

            holder = strs[0].substring(0, value);
            System.out.println(holder);

            for (int i = 1; i < size; i++) {
                if (holder.equals(strs[i].substring(0, value))) {
                    count = count + 1;
                    System.out.println(holder + "matched with" + strs[i].substring(0, value));
                    System.out.println(count);
                }

            }
        } else if (!Objects.equals(strs[0], "") && size == 1) {
            holder = strs[0];
            System.out.println("Under else if");
            return holder;
        }
        else {
            return "";
        }

        if (count > 0) {
            return holder;
        } else {
            return "";
        }
        }

    int longestSelection(String[] strs){
        int count = 0;
        for (int i=0;i< strs.length;i++){
            if(strs[i].length()<2){
                count = count + 1;
            }

        }
        if (count>0){
            return 1;
        }
        else return 2;


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
