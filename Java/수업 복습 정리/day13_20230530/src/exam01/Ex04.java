package exam01;

public class Ex04 {
    public static void main(String[] args) {
        A a = new A(){
            public void method(){
                System.out.println("변경된 method()"); // 객체를 만드는 과정중에 메서드를 재정의할 수 있다.
            }
        };
        a.method();
    }
}
