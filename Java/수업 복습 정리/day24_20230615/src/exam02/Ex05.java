package exam02;

import java.util.Arrays;
import java.util.List;

public class Ex05 {
    public static void main(String[] args) {
        List<String> fruits1 = Arrays.asList("Banana","Orange", "Apple","Melon");

        Stream2.stream(fruits1).forEach(System.out::println);
    }
}
