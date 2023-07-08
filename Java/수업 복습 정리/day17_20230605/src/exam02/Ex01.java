package exam02;

import java.text.DecimalFormat;

public class Ex01 {
    public static void main(String[] args) {
        double num = 100000.123;
//        String pattern = "0,000.000000"; 없는 자리수도 000 을 채워줌.
        String pattern = "#,###.######";
        DecimalFormat decimalFormat = new DecimalFormat(pattern);
        String strNum = decimalFormat.format(num);
        System.out.println(strNum);

    }
}
