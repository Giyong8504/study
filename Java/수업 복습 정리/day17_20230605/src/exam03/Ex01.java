package exam03;

import java.util.Date;

public class Ex01 {
    public static void main(String[] args) {
        Date date = new Date(); //특수한 목적외에는 잘 안씀. 쓰지마!! Calendar 쓰자.
        int year = date.getYear();
        int month = date.getMonth(); //0~11 값.
        int day = date.getDay();

        int hour = date.getHours();
        int minute = date.getMinutes();
        int sec = date.getSeconds();
        System.out.printf("%d-%d-%d %d:%d:%d%n",year,month+1,day,hour,minute,sec);
    }
}
