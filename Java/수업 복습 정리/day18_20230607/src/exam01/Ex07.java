package exam01;

import java.time.LocalDate;
import java.time.Month;
import java.time.format.TextStyle;
import java.util.Locale;

public class Ex07 {
    public static void main(String[] args) { //getDisplayName 메서드를 가지고 각 나라에 맞게 사용이 가능함 정의되어있음.
        LocalDate date1 = LocalDate.now();
        Month month = date1.getMonth();
        System.out.printf("English : %s%n",month.getDisplayName(TextStyle.FULL, Locale.JAPAN));
        System.out.printf("English : %s%n",month.getDisplayName(TextStyle.NARROW, Locale.JAPAN));
        System.out.printf("English : %s%n",month.getDisplayName(TextStyle.SHORT, Locale.JAPAN));
    }
}
