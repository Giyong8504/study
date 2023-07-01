package exam02;

public class Ex02 {
    public static void main(String[] args) {// 다형성
        C c = new C();
        A a = c; // A 객체의 내용의 C객체의 자원 -> 양만 A 클래스 정의 범위로 한정
        B b = c;
        // 상속을 통해서 c 라는 값이 담겨있음.(다만,크기만 작아짐)
        // C 객체가 포함하고 있는 B, A 객체로 자료형이 변경 -> 다형성



    }
}
