package exam02;

public class Ex01 {
    public static void main(String[] args) {
        Box appleBox = new Box();
        appleBox.put(new Apple());
        Apple apple = (Apple)appleBox.get();
        //오류가 없긴 하지만 형변환도 해야하고 타입에 대한 출처를 확인해야한다. instanceof .
        apple.showInfo();


        /**
        Box melonBox = new Box();
        melonBox.put(new Melon());
        Melon melon = (Melon)melonBox.get();
        melon.showInfo();*/
    }
}
