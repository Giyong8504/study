package exam02;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Ex04 {
    public static void main(String[] args) {
        List<String> fruits1 = Arrays.asList("Banana","Orange", "Apple","Melon");

        Stream<String> stm =fruits1.stream();
        stm.sorted().forEach(System.out::println); //스트림은 일회용

        stm.sorted().forEach(System.out::println);
    }
}
