package exam03;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Ex01 {
    public static void main(String[] args) {
        Stream.of("Appple", "Orange" , "Mango")
                .map(String::toUpperCase)
                .forEach(System.out::println);

        int total = IntStream.of(99,77,88,55,44).sum();
        System.out.println(total);
    }
}
