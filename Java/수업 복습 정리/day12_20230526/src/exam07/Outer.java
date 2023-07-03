package exam07;

public class Outer {
    int num1 = 100;
    static int num2 = 200;

    static void outerMethod() {
        System.out.println("외부 클래스 정적 메서드!");
    }

    static class Inner {
        void method() {
            num2 = 300;
            //Outer.this.num1 = 200;
            System.out.println("메서드!!!");
            outerMethod();
        }
    }


}
