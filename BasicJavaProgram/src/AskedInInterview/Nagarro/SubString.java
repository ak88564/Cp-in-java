package AskedInInterview.Nagarro;
/*
You are given a string X and a string containing single character Y.

Your task is to find the largest distance between any two occurrences of the character Y in string X.

The distance is defined by the number of distinct characters between any two occurrences of character Y in string X (excluding whitespaces and the character being searched for).

If there is no occurrence or only one occurrence of the given character, the function should return -1.

Input Specification:

input1: A string value X

input2: A string value containing a single character Y for which the largest distance has to be calculated

Output specifications:

Return the largest distance between any two occurrences of the character Y i.e., the number of distinct characters that exist between any two occurrences of character Y in string X
 */

public class SubString {
    static int distanceCount(String s1, char c){

        int count = 0;
        int countC = 0; // counts the char c value
        int firstIndex = 0;
        int lastIndex = 0;
        int result = -1;

        // first find the index of the c from the beginning
        for(int i=0; i<s1.length(); i++){
            if(s1.charAt(i)==c){
                firstIndex = i;
                break;
            }
        }
        // now find the index from the end
        for(int i = s1.length()-1; i>=0; i--){
            if(s1.charAt(i) == c && s1.charAt(i) != firstIndex){
                lastIndex = i;
                break;
            }
            else if(i==firstIndex){
                return result;
            }
        }

        // remove the repeating character
        for(int i = firstIndex+1; i<lastIndex; i++){
            if(s1.charAt(i) == c){
                countC++;
            }
        }
        count = (lastIndex+1) - (firstIndex+1);
        count = count - countC;
        return count;
    }
    public static void main(String[] args) {
        System.out.println(distanceCount("ssadityakumar",'a'));
    }
}
// TC: O(n), SC: O(1)
/*
Approach 1:
First find the index from start then find the index from the last.
Now calculate the repeating characters c between the start index and the last index(excluding this 2)
Now calculate the distance between the last and the start index
Subtract the repeating chars from the distance in the previous step
Return the result
 */

