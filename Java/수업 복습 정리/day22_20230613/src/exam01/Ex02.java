package exam01;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Ex02 {
    public static void main(String [] args) {
        List<String> names = Arrays.asList("이름3","이름2","이름1","이름5","이름4");

        String max = Collections.max(names); //정렬하고 가장 끝에 있는 값.
        System.out.println(max);

//        String min = Collections.min(names, Comparator.reverseOrder()); // 가장 앞쪽에 정렬된 내용 // 정렬까지.
        String min = Collections.min(names, Collections.reverseOrder()); // 같은 기능을 정의해뒀음. 위에꺼쓰거나 밑에거 쓰꺼나
        System.out.println(min);

    }
}
