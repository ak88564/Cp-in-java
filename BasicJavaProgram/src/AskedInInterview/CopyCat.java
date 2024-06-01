package AskedInInterview;

/*
 JP Morgan chase co.
Copycat question where we have to count the number of words that can be written by displacing the character.
Suppose Rahit wrote “car” for an answer, Ashish can write “acr” with difference 2, or “arc” with differnece 3.
Note That: The letters are all in lowercase.
 */

import java.util.Scanner;

public class CopyCat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        String s = sc.next();
        System.out.println("Inputted string is: " + s);
        char ch[] = s.toCharArray();
        for (int i=0;i<ch.length-1 ;i++){
            for (int j=i+1;j<=i+1;j++){
                if(ch[i]!=ch[j]){
                    count = count + 1;
                }

            }
        }
        if (ch[(ch.length)-1] != ch[0]){
            count++;
        }
        System.out.println("Answer is: " + count);
    }
}
