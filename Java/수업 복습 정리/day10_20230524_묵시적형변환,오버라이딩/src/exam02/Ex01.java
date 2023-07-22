package exam02;

public class Ex01 {
    public static void main(String[] args) {
//        Human human = new Human();
        Animal human = new Human();
        human.move();

        //Bird bird = new Bird();
        Animal bird = new Bird();
        bird.move();
        //Tiger tiger = new Tiger();
        Animal tiger = new Tiger(); // Animal이라도 자신의 것을 먼저 호출한다. 메서드오버라딩
        tiger.move();
    }
}
