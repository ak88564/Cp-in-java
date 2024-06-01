package Striver_A2Z_DSA_sheet;

import java.util.ArrayList;
import java.util.List;

public class ReverseString {
    public void method1(){
//        String str = ["Aditya", "India", "Ramesh"];
        List<String> list1 = new ArrayList<String>();
        list1.add("Aditya");
        list1.add("India");
        list1.add("Ramesh");
        System.out.println(list1.toString());

        String str1 = "Aditya";
        StringBuilder sb = new StringBuilder();
        for (int i=str1.length()-1;i>=0;i--){
            char ch = str1.charAt(i);
            sb.append(ch);

        }
        System.out.println(sb.toString());

    }

    public static void main(String[] args) {
        ReverseString obj1 = new ReverseString();
        obj1.method1();
    }
}
