package exam06;

public class Ex01 {
    public static void main(String[] args) {
        Outer out = new Outer();
        Outer.Inner inner = out.new Inner(); // Outer 객체가 생성되어야 Inner 객체가 생성 가능
        inner.printNum();
    }
}
