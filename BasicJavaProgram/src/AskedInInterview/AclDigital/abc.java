package AskedInInterview.AclDigital;

// String s = "bAditya kumar Aditya kumar"
/*
Wap in java 8 to count the duplicate chars which is occurring more than 1. Also skip the first two chars
while counting.
 */


import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class abc {
    public static void main(String[] args) {
        String s = "bAditya kumar Aditya kumar";

        Map<Character, Long> mp = s.chars().skip(2).mapToObj(x -> (char) x).collect(Collectors.
                groupingBy(Function.identity(), Collectors.counting()));
        for(Map.Entry<Character, Long> entry : mp.entrySet()){
            if(entry.getValue()> 1){
                System.out.println(entry.getKey() + " : " + entry.getValue());
            }
        }
    }
}

