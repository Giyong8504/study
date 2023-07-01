package exam03;

public class Ex03 {
    public static void main(String[] args) {
//        C c = new C();

        A a = new C();
        B b = new C();
        B bb = (B)a;

        System.out.println(a instanceof  C);
        System.out.println(a instanceof  B);
        System.out.println(a instanceof  A);
    }
}
