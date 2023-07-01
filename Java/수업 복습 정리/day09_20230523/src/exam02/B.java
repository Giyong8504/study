package exam02;

public class B extends A {
    int numB = 20;

    public B (){
        super(); // 상위 클래스의 기본 생성자 메서드 -> A()
        System.out.println("B 생성자!");
    }
}
