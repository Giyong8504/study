package exam01;

import javax.swing.*;

public class Ex04 {
    public static void main(String[] args) {
        ThreadEx04 th = new ThreadEx04();
        th.start();


        String str = JOptionPane.showInputDialog("아무거나 입력?");
        System.out.println(str);
        System.out.println("작업 실행?"); // 기본적으로 brock 되어있으나 start 하면 다른 스레드에서 실행된다.
        th.interrupt();

    }
}
class ThreadEx04 extends Thread {
    public void run() {
        int i = 10;
        //상태 값을 가지고 통제가 가능하다.
        while (!isInterrupted()) { //interrput() 호출 시 true 가 되어 빠져나간다.
            System.out.println(i--);
//            for(long j = 0; j < 1500000000L; j++);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) { //true 였다가 false로 돌아가서 다시 실행하게 돌아감.
                System.out.println("Interrupted - false");
                System.out.println("isInterrupted() :  " + isInterrupted());
                interrupted(); // 이걸 한번 더 호출해서 true 로 만든다. (sleep은 이렇게 한번 더 써준다.)
            }
            if(i <= 0) break;


        }
    }
}