package exam03;

import static java.lang.Math.*; // 임포트하게되면 메서드 명만 가지고도 가능하다.

public class Ex01 {
    public static void main(String[] args) {
//        System.out.println(Math.abs(-10)); //절대값
//        System.out.println(Math.sqrt(9));  //2  루트
//        System.out.println(Math.pow(2,3)); //8 제곱

        System.out.println(abs(-10)); //절대값
        System.out.println(sqrt(9));  //2  루트
        System.out.println(pow(2,3)); //8 제곱
        System.out.println(ceil(3.2)); //올림
        System.out.println(floor(3.6)); //버림
        System.out.println(round(5.6)); //반올림
    }
}
