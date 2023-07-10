package exam01;

import java.time.LocalDate;
import java.time.temporal.ChronoField;

public class Ex05 {
    public static void main(String[] args) {
        String[] yoils = {"","월","화","수","목","금","토","일"}; // 달력 과제
        LocalDate date1 = LocalDate.now();
        int yoil = date1.get(ChronoField.DAY_OF_WEEK); // 요일 1~7 (월 ~ 일)
        System.out.println(yoil + ", " + yoils[yoil]);
    }
}
