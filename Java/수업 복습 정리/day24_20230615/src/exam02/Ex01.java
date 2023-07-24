package exam02;

import java.util.Arrays;
import java.util.List;

public class Ex01 {
    public static void main(String[] args) {
        List<String> fruits1 = Arrays.asList("Melon","Banana","Apple","Orange");
        fruits1.stream().sorted().forEach(System.out::println);

        String[] fruits2 = {"Melon","Banana","Apple","Orange"};
        Arrays.stream(fruits2).sorted().forEach(System.out::println);


    }
}
