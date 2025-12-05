package AskedInInterview.WissenTechnology;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicatesThroughSet {
    public static void main(String[] args) {
        int[] arr = new int[] {22, 55, 77, 44, 22, 55};

        Set<Integer> s = new HashSet<>();
        for(int i=0;i<arr.length;i++){
            s.add(arr[i]);
        }
        System.out.println(s);
    }
}
