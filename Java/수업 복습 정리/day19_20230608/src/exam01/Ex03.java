package exam01;

import java.time.Instant;

public class Ex03 {
    public static void main(String[] args) {
        Instant instant = Instant.now(); //UTC 시간 기준.
//        System.out.println(instant);
        long timestamp = instant.toEpochMilli();
        System.out.println(timestamp);

        long timestamp2 = System.currentTimeMillis();
        System.out.println(timestamp2);
    }
}
