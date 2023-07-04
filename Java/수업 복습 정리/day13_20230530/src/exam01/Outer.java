package exam01;

public class Outer {
    public void method() { // 여기에 정의된 것이 지역
        // 지역
        class Inner{
            void innerMethod(){
                System.out.println("지역 내부 클래스에서 호출된 메서드!");
            }
        }

        Inner inner = new Inner();
        inner.innerMethod();
    }
}
