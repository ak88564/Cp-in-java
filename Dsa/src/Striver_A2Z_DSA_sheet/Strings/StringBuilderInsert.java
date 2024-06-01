package Striver_A2Z_DSA_sheet.Strings;

public class StringBuilderInsert {
    public static void main(String[] args) {
        String s= "Aditya is a good boy";
        StringBuilder str = new StringBuilder();
        str.insert(0, s.substring(1, s.length()-1));
        System.out.println(str.toString());
    }
}
