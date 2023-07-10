package exam02;

import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;

public class Ex04 {
    public static void main(String[] args) {
        LocalDateTime dateTime1 = LocalDateTime.now();
        ZoneOffset offset = ZoneOffset.of("+9"); //이게 바로 한국시간!
        OffsetDateTime offsetDateTime = dateTime1.atOffset(offset); // 물리적 시간대 입력
        System.out.println(offsetDateTime);

        ZoneOffset offset2 = ZoneOffset.of("+6");
        OffsetDateTime offsetDateTime2 = OffsetDateTime.now().withOffsetSameInstant(offset2);
        System.out.println(offsetDateTime2);
    }
}
