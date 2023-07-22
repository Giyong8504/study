package exam03;

import java.util.function.Predicate;

public class Ex02 {
    public static void main(String[] args) {
        Predicate<Integer> cond1 = x -> x >= 10;
        Predicate<Integer> cond2 = x -> x <= 100;

        Predicate<Integer> cond3 = cond1.and(cond2); //x >= 10 && x <= 100
        Predicate<Integer> cond4 = cond2.negate(); //x > 100

        boolean result1 = cond3.test(50);
        boolean result2 = cond3.test(200);
        boolean result3 = cond4.test(110);

        System.out.printf("result1=%s, result2=%s, result3=%s%n",result1,result2,result3);
    }
}
