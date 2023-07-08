package homeWork;

import java.util.HashSet;

public class H3 {
    //정수로 된 난수 n개 발생 시킵니다.
    //발생한 정수를 작은 순서대로 나열 한 후 중간값을 구하시오
    //n개가 홀수라면 중간값은 1개, 짝수라면 중간값은 2개가 됩니다.
    public static void main(String[] args) {
        for(int i = 0; i < 10; i++){
            int num = (int)(Math.random() * 10);
            System.out.println(num);
        }

    }
}
