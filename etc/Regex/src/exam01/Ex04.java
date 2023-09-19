package exam01;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ex04 {
    public static void main(String[] args) {
        String[] mobiles = {
                "032-320-1234",
                "016-210-1234",
                "010-1234-1234",
                "011-123-123",
                "000010-1234-1234000",
        };

        Pattern pattern = Pattern.compile("^01[016]-\\d{3,4}-\\d{4}$");
        for (String mobile : mobiles) {
            Matcher matcher = pattern.matcher(mobile);
            if (matcher.find()) {
                System.out.println(mobile);
            }
        }
    }
}
