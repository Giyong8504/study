package exam01;

import java.awt.*;

public class Ex01 {
    public static void main(String[] args) {
        boolean result1 = true && true;
        boolean result2 = false && false;

        System.out.printf("result1 = %s%n", result1);
        System.out.printf("result2 = %s%n", result2);

        boolean result3 = false || true;
        boolean result4 = true || false;

        System.out.printf("result3 = %s%n", result3);
        System.out.printf("result4 = %s%n", result4);


        int num = 15;

        //num 가 10 이상 100 이하 수인지 체크
        boolean result5 = num >= 10; //참
        boolean result6 = num <= 100; //참

        boolean result7 = result5 && result6;
        boolean result8 = num >=10 && num <= 100;

        System.out.println(result8);



    }
}
