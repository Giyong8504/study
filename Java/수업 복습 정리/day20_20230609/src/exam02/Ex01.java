package exam02;

import java.util.HashSet;

public class Ex01 {
    public static void main(String[] args) {
        HashSet<String> names = new HashSet<>();
        names.add("이름1");
        names.add("이름2");
        names.add("이름2");
        names.add("이름3");
        names.add("이름4");
        names.add("이름5");

        System.out.println(names); //toString() 이 생략되어있지만 재정의 되어있음.

        //순서를 유지 하지 않음.(index 가 없음)
        //중복값이 제거됨.
        //검색을 빨리할 수 있는 구조로 섞여있어 알아서 배치해서 바뀌지 않음.

    }
}
