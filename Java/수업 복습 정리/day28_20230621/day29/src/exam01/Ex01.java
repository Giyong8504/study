package exam01;

public class Ex01 {
    public static void main(String[] args) {
        Thread mainThread = Thread.currentThread();
        ThreadGroup grp1 = mainThread.getThreadGroup();
        System.out.println(grp1.getName());

        Thread th = new Thread();
        ThreadGroup grp2 = th.getThreadGroup();
        System.out.println(grp2.getName());


    }

}
