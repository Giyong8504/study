package exam02;

public class Human extends Animal {
    public void readBook(){
        System.out.println("독서를 한다.");
    }
    @Override
    public void move() {
//        super.move();
        System.out.println("두발로 직립보행 한다.");
    }
}

