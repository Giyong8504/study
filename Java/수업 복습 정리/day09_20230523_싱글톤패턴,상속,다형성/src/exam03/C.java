package exam03;

public class C extends B {
    int numC = 30;

    public C() { // 기본생성자. 없어도 컴파일이 이미 추가해둠
        super(); // B() 기본생성자 호출.
        System.out.println("C 생성자!");
    }
}
