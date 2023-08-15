package exam02;

public class Ex03 {
    public static void main(String[] args) {
        Thread1 th1 = new Thread1();
        th1.run(); //메인호출되고 run나옴
        System.out.println("------------------");
        th1.start(); // 새로운 스텍이 만들어지고 run이 호출되서 쓰레드가 만들어짐. start를 호출해야만.
        //main쓰레드가 있어야만 쓰레드 생성이 가능함.

    }
}

class Thread1 extends Thread {
    public void run(){
        throwException();

    }
    public void throwException() {
        try {
            throw new Exception();
        }catch (Exception e) {
            e.printStackTrace();
        }
    }
}