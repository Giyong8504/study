package exam01;

import java.util.Arrays;
import java.util.List;

public class Ex05 {
    public static void main(String[] args) {
        List<String> fruits = Arrays.asList("Apple","Orange","Mango","Lemon","Melon");

        fruits.stream().peek(System.out::println).map(String::length).forEach(System.out::println);
    }
}
