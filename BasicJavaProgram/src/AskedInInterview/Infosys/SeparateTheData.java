package AskedInInterview.Infosys;

/*
Wap to print numerical value, uppercase value,
lowercase value separately from the string of object str="123ABCDabcdef"
 */


import java.util.ArrayList;
import java.util.List;

public class SeparateTheData {
    public static void separate(String str) {
        List<Character> intValue = new ArrayList<>();
        List<Character> smallValue = new ArrayList<>();
        List<Character> largeValue = new ArrayList<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (Character.isDigit(ch)) {
                intValue.add(ch);
            } else if (Character.isLowerCase(ch)) {
                smallValue.add(ch);
            } else {
                largeValue.add(ch);
            }
        }
        System.out.println(intValue);
        System.out.println(smallValue);
        System.out.println(largeValue);

    }
    public static void main(String[] args) {
        String str = "123ABCDabcdef";
        separate(str);
    }
}
