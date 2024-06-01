package AskedInInterview;


public class ReverseString {
    public void method1(){
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
