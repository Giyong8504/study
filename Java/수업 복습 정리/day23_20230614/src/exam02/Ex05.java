package exam02;

public class Ex05 {
    public static void main(String[] args) {
        int c = 10;
        Calculator cal = (a,b) -> {
//           c = 20; //final :변경불가 // 위에 값을 지키기 위해 지역변수의 상수화가 된다.
           return a + b + c;
        };

    }
}
