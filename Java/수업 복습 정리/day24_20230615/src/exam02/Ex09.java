package exam02;

import java.util.stream.IntStream;

public class Ex09 {
    public static void main(String[] args) {
//        IntStream.range(0,10).forEach(x -> System.out.println(x + "번 반복"));
//        IntStream.rangeClosed(0,10).forEach(x -> System.out.println(x + "번 반복")); //10번까지 포함
        int total = IntStream.rangeClosed(1,100).sum();
        System.out.println(total);
    }
}
