package exam01;

public class Account {
    private static int balance = 1000;

    public int getBalance() {
        return balance;
    }
    /*public synchronized void withdraw(int money) {
        if(balance >= money) {

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            balance -= money;

        }
    }*/
    public void withdraw(int money) {

        synchronized (this){ // 특정 코드만 접근하게 하는 방법
        if(balance >= money) {

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            balance -= money;
        }
        }
    }


}
