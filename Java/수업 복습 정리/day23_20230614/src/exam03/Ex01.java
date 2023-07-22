package exam03;

import java.util.function.Function;

public class Ex01 {
    public static void main(String[] args) {
        Function<String, Integer> func1 = s -> s.length();
        int len = func1.apply("ABC");

        Function<Integer,Integer> func2 = x -> x*x;
        int result = func2.apply(10);
        System.out.println(result);

        Function<String, Integer> func3 = func1.andThen(func2);
        int result2 = func3.apply("APPLE");
        System.out.println(result2);

        Function<String, Integer> func4 = func2.compose(func1);
        int result3 = func4.apply("APPLE");
        System.out.println(result3);

        Function<String, String> func5 = Function.identity(); //x -> x
        String str = func5.apply("DEF");
        System.out.println(str);



    }
}
