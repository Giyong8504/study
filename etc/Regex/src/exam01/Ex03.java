package exam01;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ex03 {
    public static void main(String[] args) {
        String[] str = {"AA", "BAA", "AB", "ABC"};
        Pattern pattern = Pattern.compile("[A]{2}");
        for (String s : str) {
            Matcher matcher = pattern.matcher(s);
            if (matcher.find()) {
                System.out.println(s);
            }
        }
    }
}
