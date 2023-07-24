package exam01;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Ex03 {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("이름1","이름2","이름3");
//        String[] names2 = names.stream().toArray(x -> new Stream[x]);
//        System.out.println(Arrays.toString(names2));

        String[] names3 = names.stream().toArray(String[]::new);
    }
}
