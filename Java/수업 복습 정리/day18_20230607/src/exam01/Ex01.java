package exam01;

import java.util.Calendar;
import static java.util.Calendar.*; // static 으로 import 하게되면 Calendar를 계속 붙이지 않아도 된다.

public class Ex01 {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        cal.add(HOUR_OF_DAY,6); //6시간 뒤
        cal.add(HOUR_OF_DAY,-6); //6시간 전

//        cal.set(YEAR, 2022); //원하는 날짜 시간 변경 가능.
//        cal.set(HOUR_OF_DAY,12);


        showDate(cal);
        //단점. cal의 값이 바뀌어서 위의 객체가 바뀌어버림. 원래 데이터를 사용할 수 없다.


    }
    private static void showDate(Calendar cal){
        int year = cal.get(YEAR);
        int month = cal.get(MONTH); //0~11
        int day = cal.get(DAY_OF_MONTH);

        int hour = cal.get(HOUR_OF_DAY); // HOUR -12, HOUR_OF_DAY :24
        int minute = cal.get(MINUTE);
        int second = cal.get(SECOND);

        System.out.printf("%d-%d-%d %d:%d:%d%n", year,month+1,day,hour,minute,second);

    }
}
