package exam02;

public class Ex06 {
    public static void main(String[] args) {
        Thread mainTh = Thread.currentThread();
        System.out.println(mainTh.getThreadGroup());

        Thread4 th = new Thread4();
        System.out.println(th.getThreadGroup()); //따로 그룹을 지정하지 않으면 main으로 그룹되어있음

        th.setDaemon(true);// main 이 다 끝나면 setDaemon도 같이 끝나면서 종료함. 현재 진행중인 쓰레드가 멈추면 얘도 멈춤.
        th.start();

        for(int i = 1; i <= 10; i++){
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }
}
class Thread4 extends Thread {
    public void run() {
        while(true) {
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("문서 저장 완료!");
        }
    }
}