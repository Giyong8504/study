package exam01;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Ex04 {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>(); //다형성을 이용해 유연하게 사용.
        names.add("이름1");
        names.add("이름2");
        names.add("이름3");
        names.add("이름4");
        names.add("이름5");

        ListIterator<String> iter = names.listIterator(); // 순방향 먼저 하고 역방향 ㄷ가능함.
        while (iter.hasNext()) {
            String name = iter.next(); // 순방향조회
            System.out.println(name);
        }
        System.out.println("-=------------------");
        while(iter.hasPrevious()){
            String name = iter.previous(); // 역방향 이동 조회.
            System.out.println(name);
        }
    }
}

