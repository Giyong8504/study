package exam02;

public class Student {
    static int id;
    String name;
    String subject;

    void showInfo() { // 인스턴스 메서드
        System.out.printf("id=%d, name=%s, subject=%s%n", id, name, subject);
        staticMethod();
        id = 100;
        //인스턴스 메서드는 쪽에서는 static이 이미 활성화 되어있어서 사용이 가능.
    }

    static void staticMethod() { // 정적메서드
        System.out.println("정적 메서드!");
        //this.showInfo();
        //this.name
        //static은 this가 없다.
    }
}
