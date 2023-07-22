package exam03;

import java.util.ArrayList;
import java.util.Arrays;

public class Ex03 {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>(Arrays.asList("Apple","Orange","Mango"));
//        fruits.forEach(s -> System.out.println(s)); //대입만 하는거라 더 짧게 쓸 수 있음.
        fruits.forEach(System.out::println);
    }

}
