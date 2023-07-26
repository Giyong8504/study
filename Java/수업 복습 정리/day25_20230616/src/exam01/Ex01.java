package exam01;

import java.util.Arrays;
import java.util.List;

public class Ex01 {
    public static void main(String[] args) {
        List<String> fruits1 = Arrays.asList("Apple","Orange","Mango","Melon");
        String[] fruits2= {"Apple","Orange","Mango","Melon"};

        fruits1.stream().map(String::length).forEach(System.out::println);
        Arrays.stream(fruits2).map(String::length).forEach(System.out::println);

    }
}
