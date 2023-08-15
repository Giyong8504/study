package exam02;

public class Ex05 {
    public static void main(String[] args) {
        Thread2 th2 = new Thread2();
        Thread3 th3 = new Thread3();
        th2.setPriority(Thread.MAX_PRIORITY);
        th3.setPriority(Thread.MIN_PRIORITY);

        System.out.println("th2 우선순위 : " + th2.getPriority()); //10
        System.out.println("th3 우선순위 : " + th3.getPriority()); //1

        th2.start();
        th3.start();

    }
}
class Thread2 extends Thread {
    public void run(){
        for(int i = 0; i < 300; i++) {
            System.out.print(new String ("-")); //느려지게 테스트 위한것.
            for(long j = 0; j < 10000000L; i++);

        }

    }
}
class Thread3 extends Thread {
    public void run() {
        for (int i = 0; i < 300; i++) {
            System.out.print(new String("|")); //느려지게 테스트 위한것.
            for (long j = 0; j < 10000000L; i++) ;
        }
    }
}