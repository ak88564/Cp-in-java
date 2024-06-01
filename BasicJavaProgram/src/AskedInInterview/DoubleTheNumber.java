package AskedInInterview;
/*
Using stream api double the number
 */

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DoubleTheNumber {
    public static void main(String[] args) {
        List<Integer> num = Arrays.asList(2, 3);
        List<Integer> sq = num.stream().map(x -> x*x).collect(Collectors.toList());
        System.out.println(sq);
    }
}
