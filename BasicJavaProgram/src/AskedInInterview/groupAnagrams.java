package AskedInInterview;

// Company: Perennial systems

/*
You are given with a having words separated with whitespace. Your task is to write a Java program to group the words
 into sets of anagrams and return the group (array of Strings) with highest number of anagram words.
Anagrams are words or phrases formed by rearranging the letters of another word or phrase, using all the original
letters exactly once.
Note:
Your code should adhere to best practices and coding standards.
It should be clean code.
Your code will be evaluated based on time complexity and code complexity.
In case two groups has same and highest number of words, then return group with word occurring first in input array.
Other corner cases and validations are expected in the code.
 */

import java.util.*;

public class groupAnagrams {
    public static String[] groupFunc(String words) {
        List<ArrayList<String>> groups = new ArrayList<ArrayList<String>>();
        ArrayList<String> text = new ArrayList<>();
        StringBuilder stringBuilder = new StringBuilder();

        // Creates a list of string
        List<String> result = new ArrayList<>();
        result = List.of(words.split(" "));
        System.out.println(result);

        for (int j = 0; j < result.size(); j++) {
            for (int i = 0; i < result.size(); i++) {
                if (i == j) {
                    continue;
                }
                if (stringValidator(result.get(j), result.get(i))) {
                    text.add(result.get(j));
                    text.add(result.get(i));
                } else {
                    continue;
                }
            }
            groups.add(text);

        }
        // for loop to know the largest arraylist in the arraylist
        int max =0; // max size of the arraylist
        int indexholder = 0; // index holder of the arraylist
        int i;
        for (i = 0; i < groups.size();i++){
            int count = groups.get(i).size();
            if(count >max){
                max = count;
                indexholder = i;
            }
        }

        // Now conversion of largest arraylist to array
        String[] finalresult = new String[max];
        for(int m = 0; m < groups.get(indexholder).size(); m++){
            finalresult[m] = groups.get(indexholder).get(m);        }
        return finalresult;


    }


    public static boolean stringValidator(String str1, String str2) {
        if(str1.length() != str2.length()){
            return false;
        }
        Map<Character, Integer> map1 = new HashMap<Character, Integer>();
        Map<Character, Integer> map2 = new HashMap<Character, Integer>();
        for(int i=0;i<str1.length();i++) {
            if(map1.containsKey(str1.charAt(i))){
                map1.put(str1.charAt(i), map1.get(str1.charAt(i)) + 1);
            }
            map1.put(str1.charAt(i), 1);
        }

        for(int i=0;i<str2.length();i++) {
            if(map2.containsKey(str2.charAt(i))){
                map2.put(str2.charAt(i), map2.get(str2.charAt(i)) + 1);
            }
            map2.put(str2.charAt(i), 1);
        }
        System.out.println(map2);
        if(map1.equals(map2)){
            return true;
        }
        else return false;

    }

    // How to Convert a String to an Array Using a StringTokenizer
    public static String[] stringArrayGenerator(String str){

        // Creating a StringTokenizer object with delimiter
        StringTokenizer tokenizer = new StringTokenizer(str, " ");
        int tokenCount = tokenizer.countTokens();
        String[] stringArray = new String[tokenCount];

        //Converting each token to array elements
        for(int i = 0; i < tokenCount;i++){
            stringArray[i] = tokenizer.nextToken();
        }

        // Printing the output array
        for (String element: stringArray) {
            System.out.print(element + " ");
        }
        return stringArray;
    }

    public static void main(String[] args) {
        String str = new String("ate tea eta bomb mobb star");
        System.out.println(str);
        String[] out = groupFunc(str);
        for (String element : out){
            System.out.print(element + " ");

        }

    }
}


// [["ate", "tea", "eta"], ["bomb", "mobb"], ["star"]]
