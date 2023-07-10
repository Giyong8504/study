package exam02;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Ex03 {
    public static void main(String[] args) {
        String[] timeZones = {"Asia/Seoul","Asia/Manila", "Asia/Jakarta", "America/New_York"};
        for(String timezone : timeZones){
            ZoneId zId = ZoneId.of(timezone);
            ZonedDateTime zonedDateTime = ZonedDateTime.now().withZoneSameInstant(zId); // 각나라의 시간대를 알 수 있음
            //날짜 + 시간대
            System.out.println(zonedDateTime);
        }

    }
}
