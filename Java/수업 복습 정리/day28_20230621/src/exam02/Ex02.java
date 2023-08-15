package exam02;

public class Ex02 {
    public static void main(String[] args) { //병렬 작업
        MyThread myThread = new MyThread();
        myThread.start();

        Thread mainThread = Thread.currentThread();// 현재 실행중인 쓰레드 반환

        for(int i = 1; i <= 10; i++){
            System.out.println(mainThread.getName()+ ":" + i);
            try {
                Thread.sleep(1500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }//getName을 쓸 수없는데 어쩌지? currentThread() <- 현재작업중인 스레드 반환.
        }
    }
}

class MyThread extends Thread { // 내가 정의한 쓰레드.

    @Override
    public void run() {
        //실행될 작업 내용
        for(int i = 1; i <= 10; i++) {
            System.out.println(getName() + " : " + i);

            try {
                Thread.sleep(1000); //현재 쓰레드를 의미.
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            //start 하면 run을 호출하지 않는다?
            //start()가 실행되면 쓰레드를 하나 따로 만들어서 각각 작업을 하게 됨. start를 써야 생성됨.
        }
    }
}