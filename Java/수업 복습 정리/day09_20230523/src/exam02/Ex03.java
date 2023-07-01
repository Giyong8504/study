package exam02;

public class Ex03 {
    public static void main(String[] args) {
        D d = new D(); // D() -> A()
        A ad = d;

        if(ad instanceof C){ //객체인지 확인하는 것.
            C c2 = (C)ad;
        }

        C c = new C();
        A ac = c;
    }

}
