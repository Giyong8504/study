package exam02;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Ex04 {
    public static void main(String[] args) throws ParseException {
        String dateStr = "2021-06-05 23:59:59";
        String pattern = "yyyy-MM-dd HH:mm:ss";
        SimpleDateFormat sdf = new SimpleDateFormat(pattern);
        Date date = sdf.parse(dateStr);
        System.out.println(date);
    }
}
