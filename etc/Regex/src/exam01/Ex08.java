package exam01;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ex08 {
    public static void main(String[] args) {
        String[] persons = {
          "이이름 : 010-1234-1234",
          "김이름 :010-1234-1234",
          "박이름: 010-1000-1000"
        };

        String pattern = "([^\\s:]*)\\s?:\\s?(.*)";
        Pattern p = Pattern.compile(pattern);
        for (String person : persons) {
            Matcher matcher = p.matcher(person);
            if (matcher.find()) {
                String name = matcher.group(1);
                String mobile = matcher.group(2);
                System.out.printf("이름 : %s, 휴대전화번호 : %s%n", name, mobile);
            }
        }
    }
}
