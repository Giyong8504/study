package exam02;

import java.util.Arrays;

public class Ex07 {
    public static void main(String[] args) {
        String[] fruits = {"Applem","Orange" ,"Mango","Melon","Banana"};

        Arrays.stream(fruits).map(s ->s.length()).forEach(System.out::println);
        //String -> Integer로 바뀜. //기본형을 쓰는게 효율이 좋음

        Arrays.stream(fruits).mapToInt(s->s.length()).forEach(System.out::println);
                                //String -> int 
    }
}
