package exam01;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Ex04 {
    public static void main(String[] args) {
        String parttern = "yyyy.MM.dd HH:mm";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(parttern);

        LocalDateTime today = LocalDateTime.now();
        String strDate = formatter.format(today);

        System.out.println(strDate);

        String pattern2 = "yy.MM.dd a hh:mm:ss E";
        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern(pattern2);
        String strDate2 = formatter2.format(today);
        System.out.println(strDate2);


    }
}
