package exam02;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.IntBinaryOperator;

public class Ex08 {
    public static void main(String[] args) {
//        BiFunction<Integer,Integer,Integer> cal = (a,b) -> a + b;

//        BinaryOperator<Integer> cal = (a,b) -> a + b; // 자료형이 동일하면 이렇게 사용. 이거 하위클래스임.
        // 언박싱, 오토박싱, 언박싱 -> 성능저하

//        int result = cal.apply(10,20);
        IntBinaryOperator cal = (a,b) -> a + b;
        int result = cal.applyAsInt(10,20);
        System.out.println(result);
    }
}
