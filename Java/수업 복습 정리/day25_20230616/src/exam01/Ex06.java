package exam01;

import java.util.Optional;

public class Ex06 {
    public static void main(String[] args) {
//        String str = "ABC";
        String str = null;
//        Optional<String> opt = Optional.of(str);
        Optional<String> opt = Optional.ofNullable(str);
//        String str2 = opt.get();
        String str2 = opt.orElse("EDF");
        System.out.println(str2);

    }
}
