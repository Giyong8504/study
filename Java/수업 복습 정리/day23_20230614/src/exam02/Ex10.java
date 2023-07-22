package exam02;

import java.util.ArrayList;
import java.util.Arrays;

public class Ex10 {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>(Arrays.asList("Apple","Orange","Mango"));

        fruits.forEach(s -> System.out.println(s));

    }
}

