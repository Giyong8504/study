package exam01;

public class Ex03 {
    public static void main(String[] args){
        ThraedEx03_1 th1 = new ThraedEx03_1();
        ThraedEx03_2 th2 = new ThraedEx03_2();
        th1.start();
        th2.start();


        try {// 메인쓰레드가 얘네 끝날 때까지 대기!
            th1.join(); // join으로 간단하게 작업 해당작업 먼저 다하고 메인이 끝날 수 있게 지정해줌
            th2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


        /*try {
            Thread.sleep(3000); //현재 실행중인 쓰레드 main 지연중
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }*/
        System.out.println("작업 종료!");


    }
}
class ThraedEx03_1 extends Thread {
    public void run() {
        for(int i = 0; i < 10; i++){
            System.out.print("|"); //만약 여기서 지연하겠다면 여기서 하면됨.
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("1번 종료!");
    }
}
class ThraedEx03_2 extends Thread {
    public void run() {
        for(int i = 0; i < 10; i++){
            System.out.print("-");
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("2번 종료!");
    }
}
