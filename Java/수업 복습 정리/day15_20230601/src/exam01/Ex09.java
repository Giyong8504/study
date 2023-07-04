package exam01;

import java.util.HashSet;

public class Ex09 {
    public static void main(String[] args) {
        HashSet<String> names = new HashSet<String>();
        names.add("ABC");
        names.add(new String("ABC"));
        names.add("DEF");
        names.add(new String("DEF"));
        names.add("GHI");



        //비교의 기준 - equals와 hashCode 와 동등해야 됨.
        System.out.println(names);
    }
}
