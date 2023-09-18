package exam01;

import java.util.Arrays;

public class Ex02 {
    public static void main(String[] args) {
        String fruits = "Apple  Melon Mango   Banana";
        String[] fruits2 = fruits.split("\\s+");
        System.out.println(Arrays.toString(fruits2));
    }
}
