package AskedInInterview.Deloitte;

import java.util.HashMap;
import java.util.Map;

public class Hashmap {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "apple");
        map.put(1, "guava");
        map.put(3, "apple");
        map.put(4, "pineapple");

        System.out.println(map);

        for(Map.Entry<Integer, String> e: map.entrySet()){
            System.out.println("Key: " + e.getKey() + " Value: " + e.getValue());
        }
    }
}
