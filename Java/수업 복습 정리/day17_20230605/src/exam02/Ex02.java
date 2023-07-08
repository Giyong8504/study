package exam02;

import java.text.DecimalFormat;
import java.text.ParseException;

public class Ex02 {
    public static void main(String[] args) throws ParseException {
        String strNum = "1,000,000,000";
        String pattern = "#,###"; // 알아서 콤마 기준으로 3개씩 인식함.
        DecimalFormat df = new DecimalFormat(pattern);
        Number number = df.parse(strNum); //원래 형태로.
        long num = number.longValue();

        System.out.println(num);
    }
}
