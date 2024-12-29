package AskedInInterview.Infosys;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*
Use stream to find the numbers which are less than 10
 */

public class StreamToFindNumbers {
    public static void main(String[] args) {
        Integer[] numbers = new Integer[] {1, 2, 3, 4, 5, 6, 90, 89, 77, 55};
        List<Integer> list1 = Arrays.asList(numbers);
        System.out.println(list1.stream().filter(i-> i<10 ).collect(Collectors.toList()));

    }
}
