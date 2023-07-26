package exam01;

import java.util.stream.IntStream;

public class Ex02 {
    public static void main(String[] args) {
//        IntStream.rangeClosed(1,100)
//                .skip(30)
//                .limit(20)
//                .forEach(System.out::println);
        int total = IntStream.rangeClosed(1,100)
                .filter(x -> x%2 ==0)
                .sum();
        System.out.println(total);
    }

}
