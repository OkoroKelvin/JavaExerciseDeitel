package semicolon.chapter17;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class IntStreamOperations {
    public static void main(String[] args) {
        int[] values = {3,20,6,1,4,8,2,5,8,7};

        System.out.println("Original values");
        System.out.println(
                IntStream.of(values).mapToObj(String::valueOf).collect(Collectors.joining(" ")));
    }
}
