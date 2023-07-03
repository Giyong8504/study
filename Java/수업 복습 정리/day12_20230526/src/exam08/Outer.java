package exam08;

public class Outer {
    void method() {
        class Inner {
            int num = 10;

            void method() {
                System.out.println("지역 내부 클래스에 정의된 메서드!");
            }
        }

        Inner in = new Inner();
        in.method();
    }
}
