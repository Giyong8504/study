package exam02;

import java.util.Arrays;

public class Ex06 {
    public static void main(String[] args) {
        String[] chars = {"AA", "AA","AAA","BB","BBB", "BBBB","CC","CCC","CCCC"};
        //최종연산이 호출되어야만 실행함.
//        Arrays.stream(chars).filter(s -> s.length() >= 3).limit(3); //지연된 연산- 중간연산 (작업만 명시한상태)
        Arrays.stream(chars)
                .filter(s -> s.length() >= 3)
                .limit(3)
                .forEach(System.out::println);
        //작업을 끊어서 자리를 바꾸면 명확하게 보기가 쉬움!


    }
}
