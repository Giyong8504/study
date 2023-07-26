package exam01;

import java.util.Arrays;

public class Ex03 {
    public static void main(String[] args) {
        String[] fruits = {"Apple","apple","Banana", "Melon","Mango"};

        Arrays.stream(fruits).map(Ex03::toCapitalize).distinct().forEach(System.out::println);
    }
    private static String toCapitalize(String str){
        return str.substring(0,1).toUpperCase() + str.substring(1);
    }
}
