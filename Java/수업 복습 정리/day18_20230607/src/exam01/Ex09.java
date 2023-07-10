package exam01;

import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;

public class Ex09 {
    public static void main(String[] args) {
        LocalDate date1 = LocalDate.now();//기존시간 불변성!!
//        LocalDate date2 = date1.plus(100, ChronoUnit.DAYS);  //100일 뒤
        LocalDate date2 = date1.plusDays(100);// 100일 뒤
        System.out.println(date2);

//        LocalDate date3 = date2.minus(100,ChronoUnit.DAYS);//100일 전
        LocalDate date3 = date2.minusDays(100); //100일 전
        System.out.println(date3);

    }
}
