package exam06;

public class Outer {
    int num1 = 30;

    class Inner { // 인스턴스 내부 클래스
        static int num = 100;

        int num1 = 20;

        void printNum() {
            System.out.println(Outer.this.num1);// 30
            System.out.println(num1); // this.num1 -> 20
        }

        static void method() {
            System.out.println("메서드!");
        }
    }
}
