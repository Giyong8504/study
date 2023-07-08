package exam01;

import java.util.Arrays;

public class Ex02 {
    public static void main(String[] args) {
        int result = add(10,20,30);
        int result2 = add(10,20);
        System.out.printf("result1 : %d%n",result);
        System.out.printf("result2 : %d%n",result2);
    }

    public static int add(int... nums){//toString은 배열의 문자열을 확인할때.
        int total = 0;
        for(int num : nums){
            total += num;
        }
        return total;
    }
}
