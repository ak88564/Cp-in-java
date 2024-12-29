package AskedInInterview;
/*
WAP to reverse the lines of strinh
For ex: "Aditya is a good boy"
Output: "boy a is Aditya"
 */

public class ReverseWordsInString {
    static void reverse(String str){
        int begin = 0;
        StringBuilder sb = new StringBuilder();
        int i;
        for(i=0;i<str.length();i++){
            if(str.charAt(i)== ' '){
                sb.insert(0,str.substring(begin, i+1));
                begin = i+1;
            }
        }
        sb.insert(0, " ");
        sb.insert(0, str.substring(begin,i));
        System.out.println(sb.toString());

    }
    public static void main(String[] args) {
        String str = new String("Aditya is a good boy");
        reverse(str);
    }
}
