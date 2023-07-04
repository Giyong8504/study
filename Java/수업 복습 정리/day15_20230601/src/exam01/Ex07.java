package exam01;

public class Ex07 {
    public static void main(String[] args) {
        //ABC, ABC는 같은 주소를 가지고 있어 같은 것을 참조하기에 두개를 만들 필요가 없다.
        //데이터영역에 상수로써 하나만 만들어짐
        //str1, str2는 같은 주소를 사용하기 때문에.

        String str1 = "ABC"; //문자열 상수
        String str2 = "ABC";

        System.out.println(str1 == str2); //얘는 주소값, 객체가 같은지 체크~
        System.out.println("str1 : " + System.identityHashCode(str1));
        System.out.println("str2 : " + System.identityHashCode(str2));
    }
}
