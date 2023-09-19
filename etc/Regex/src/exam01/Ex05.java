package exam01;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ex05 {
    public static void main(String[] args) {
        String str = "abc/abc/abc/abc/abc?t=1/abc";
        Pattern pattern = Pattern.compile("/[^?]+");
        Matcher matcher = pattern.matcher(str);
        if (matcher.find()) {
            String m = matcher.group();
            System.out.println(m);
        }
    }
}
