package exam02;

import java.util.Arrays;
import java.util.List;

public class Ex03 {
    public static void main(String[] args) { //스트림이 없으면 각각의 방식으로 출력해야한다. 데이터 처리의 통일성
        List<String> fruits1 = Arrays.asList("Banana","Orange", "Apple","Melon");
        fruits1.stream().sorted().forEach(System.out::println); //이렇게 하면 stream쪽에 메서드를 사용할 수 있게 됨

        String[] fruits2 = {"Banana","Orange", "Apple","Melon"};
        Arrays.stream(fruits2).sorted().forEach(System.out::println);
    }
}
