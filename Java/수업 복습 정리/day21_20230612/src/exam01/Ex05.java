package exam01;

import java.util.Comparator;
import java.util.TreeSet;

public class Ex05 {
    public static void main(String[] args) {
        /**
        Comparator<String> com = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2) * -1; // 내림차순 정렬
            }
        }; */

        // 정석이 있지만 이미 기능이 있어서 안쓴다.. 이거쓰자
        TreeSet<String> names = new TreeSet<String>(Comparator.reverseOrder());
        names.add("이름2");
        names.add("이름4");
        names.add("이름3");
        names.add("이름1");
        names.add("이름5");

        System.out.println(names); //기본 오름차순임.
    }
}
