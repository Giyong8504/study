package exam02;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Ex03 {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date);

//        String pattern = "yyyy-MM-dd HH:mm";
        String pattern = "yy-MM-dd a hh:mm:ss SSS E";
        SimpleDateFormat sdf1 = new SimpleDateFormat(pattern);
        String strDate = sdf1.format(date);
        System.out.println(strDate);
    }
}
