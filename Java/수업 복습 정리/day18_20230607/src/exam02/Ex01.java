package exam02;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Ex01 {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        LocalTime time = LocalTime.now();

        // 첫번째 방식
        LocalDateTime dateTime1 = date.atTime(time); //날짜에 시간 더하기
        LocalDateTime dateTime2 = LocalDateTime.of(date,time); // 날짜, 시간 합치기
        LocalDateTime dateTime3 = time.atDate(date); //시간에 날짜 더하기
        System.out.println("dateTime1 : " + dateTime1);
        System.out.println("dateTime2 : " + dateTime2);
        System.out.println("dateTime3 : " + dateTime3);
    }
}
