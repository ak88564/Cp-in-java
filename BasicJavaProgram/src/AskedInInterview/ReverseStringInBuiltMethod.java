package AskedInInterview;

public class ReverseStringInBuiltMethod {
    public static void main(String[] args) {
        String str = "Aditya is a good boy";
        StringBuilder sb = new StringBuilder();
        sb.append(str).reverse();
        System.out.println(sb.toString());
    }
}
