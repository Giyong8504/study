package exam03;

import java.util.Random;

public class Ex02 {
    public static void main(String[] args) {
        Random rand = new Random();
        rand.ints().limit(10).forEach(System.out::println);// 항상 범위 설정
        rand.doubles().limit(10).forEach(System.out::println);

    }
}
