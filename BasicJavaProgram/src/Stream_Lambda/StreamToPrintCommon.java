package AskedInInterview.Coforge;

/*
Write common elements from two arrays using Stream API
 */

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamToPrintCommon {
    public static void main(String[] args) {
        Integer[] arr1 = new Integer[]{2, 5, 7, 10, 34, 6, 11};
        Integer[] arr2 = new Integer[]{3, 5, 7, 9, 12, 6, 15};
        printCommon(arr1, arr2);
    }

    private static void printCommon(Integer[] arr1, Integer[] arr2) {
        List<Integer> l2 = Arrays.asList(  arr2);
        List<Integer> ans = Arrays.stream(arr1).filter(l2::contains).collect(Collectors.toList());

        System.out.println(ans);
    }
}
