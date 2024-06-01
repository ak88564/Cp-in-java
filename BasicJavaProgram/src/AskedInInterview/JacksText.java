package AskedInInterview;

/*
Problem Statement  :

Jack is learning to type english from the beginning and he is making an error of repeating the same words in his texts over whatsapp. Write a function that will take input for his text sent to you and then keep only the unique texts.
Note that, the uniqueness is about being word specific not position, there are nothing but alphabets in the sentences and words are separated only with white space.

Constraints:
Words in the line<=10^5
Alphabets in the words<=20

Sample Input:
Send send the image send to to to me

Output:
Send the image to me
 */

import java.util.Objects;
import java.util.Scanner;

public class JacksText {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String input = sc.nextLine();
        StringBuilder sb = new StringBuilder();
        String arr[] = input.split(" ");
        for (int i=0; i<arr.length; i++) {
//            System.out.println(arr[i]);
            int count = 0;
            for (int j=i-1; j>=0; j--) {
                if (Objects.equals(arr[i], arr[j])){
                    System.out.println("Found equal");
                    count++;
                    break;
                }
            }
            if (count==0){
                sb.append(arr[i] + " ");
            }
        }
        System.out.println(sb);

    }
}
