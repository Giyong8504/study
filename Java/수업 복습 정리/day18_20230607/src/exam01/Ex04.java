package exam01;

import java.time.LocalDate;
import java.time.temporal.ChronoField;
import static java.time.temporal.ChronoField.*; //간단하게 쓰기 위함. 편의 메서드를 사용하면 얘도 필요 없음.

public class Ex04 {
    public static void main(String[] args) {
        LocalDate date1 = LocalDate.now();

//        int year = date1.get(YEAR); //원래의 정석.
        int year = date1.getYear(); // 편의 메서드가 정의되어있음. 더 편리
//        int month = date1.get(MONTH_OF_YEAR); //1~12 로 바뀌어있음. 굳
        int month = date1.getMonthValue();
//        int day = date1.get(DAY_OF_MONTH);
        int day = date1.getDayOfMonth();

        System.out.printf("%d-%d-%d%n", year, month, day);

    }
}
