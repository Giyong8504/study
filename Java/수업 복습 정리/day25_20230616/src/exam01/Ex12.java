package exam01;

import java.util.stream.IntStream;

public class Ex12 {
    public static void main(String[] args) {
//        int total = IntStream.rangeClosed(1,100).reduce(0,(acc,n) -> acc += n);
//        System.out.println(total);

        int total = IntStream.rangeClosed(1,5).reduce(0,(acc,n) -> {
            System.out.printf("acc=%d, n=%d%n",acc,n);
            acc += n;

            return acc;
        });
        System.out.println(total);
    }
}
