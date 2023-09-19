package exam01;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ex01 {
    public static void main(String[] args) {
//        Pattern pattern = Pattern.compile("abc");
//        Pattern pattern = Pattern.compile("[a-zA-Z]");
//        Pattern pattern = Pattern.compile("[a-z]", Pattern.CASE_INSENSITIVE);
//        Pattern pattern = Pattern.compile("[0-9]");
//        Pattern pattern = Pattern.compile("\\d");
//        Pattern pattern = Pattern.compile("[^a-zA-Z]");
//        Pattern pattern = Pattern.compile("[^a-z]",Pattern.CASE_INSENSITIVE);
//        Pattern pattern = Pattern.compile("[^0-9]");
        Pattern pattern = Pattern.compile("\\D");
        String[] strs = {"AB", "abcd", "bcd", "efg", "1234", "!@#$%^"};
        for (String str : strs) {
            Matcher matcher = pattern.matcher(str);
            if (matcher.find()) {
                System.out.println(str);
            }

        }
    }
}
