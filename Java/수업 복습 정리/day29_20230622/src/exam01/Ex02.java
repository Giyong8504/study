package exam01;

public class Ex02 {
    public static void main(String[] args) {
        ThreadGroup grp1 = new ThreadGroup("Group1");
        ThreadGroup grp2 = new ThreadGroup("Group2");
        ThreadGroup grp3 = new ThreadGroup(grp1,"SubGroup1");

        Runnable r = () -> {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        };
        grp1.setMaxPriority(1);

        Thread th1 = new Thread(grp1, r, "th1");
        Thread th2 = new Thread(grp2, r, "th2");
        Thread th3 = new Thread(grp3, r, "th3");

        th1.start();
        th2.start();
        th3.start();

        grp1.list();
        grp2.list();



    }
}
