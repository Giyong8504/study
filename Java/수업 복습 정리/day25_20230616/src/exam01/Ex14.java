package exam01;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Ex14 {
    public static void main(String[] args) {
        List<String> fruits = Arrays.asList("Apple", "Orange","Mango","Melon");

        String fruitsStr = fruits.stream().map(String::toUpperCase)
                .collect(Collectors.joining(","));
        System.out.println(fruitsStr); //문자의 결합
    }
}
