package exam02;

import java.time.LocalDate;
import java.time.Period;

public class Ex05 {
    public static void main(String[] args) {
        LocalDate date1 = LocalDate.now();
        LocalDate date2 = date1.minusDays(300); //현재 시간과의 차이

        Period period = Period.between(date1,date2);
        System.out.println(period);
        int month = period.getMonths();
        int day = period.getDays();
        System.out.printf("month=%d, day=%d%n", month,day);
    }
}
