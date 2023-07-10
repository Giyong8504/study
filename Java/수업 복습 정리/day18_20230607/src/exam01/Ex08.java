package exam01;

import java.time.LocalDate;
import java.time.temporal.ChronoField;

public class Ex08 {
    public static void main(String[] args) {
        LocalDate date1 = LocalDate.now();
        System.out.println(date1);

//        LocalDate date2= date1.with(ChronoField.YEAR, 2022); //Calendar 클래스에서는 바뀌어있는데 여긴 안바뀜!
        //바뀌어있는 새로운 시간의 객체를 만들어 반환해준다.

        // 위에꺼는 많이 안쓰게 되고 간단하게 정의되어있는 메서드를 사용한다.
        LocalDate date2 = date1.withYear(2022);
        System.out.println(date2);
    }
}
