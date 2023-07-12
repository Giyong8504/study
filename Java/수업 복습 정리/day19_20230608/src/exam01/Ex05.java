package exam01;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Ex05 {
    public static void main(String[] args) {
        String strDate = "2022/11/21 12:00:00";
        String pattern = "yyyy/MM/dd HH:mm:ss";

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(pattern);

        LocalDateTime date = LocalDateTime.parse(strDate,formatter);
        System.out.println(date);
    }
}
