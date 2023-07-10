package exam02;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Ex02 {
    public static void main(String[] args) {
        LocalDateTime dateTime1 = LocalDateTime.now();
        ZonedDateTime zonedDateTime1 = dateTime1.atZone(ZoneId.of("Asia/Seoul")); //그냥 시간대가 추가된거임.
        System.out.println(zonedDateTime1);
    }
}
