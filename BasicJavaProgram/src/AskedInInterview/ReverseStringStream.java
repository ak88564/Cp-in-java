package AskedInInterview;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ReverseStringStream {
    public static void main(String[] args) {
        String str = "Aditya is a good boy";
        System.out.println(Stream.of(str).map(i->new StringBuilder(i).reverse()).collect(Collectors.toList()));
    }
}
