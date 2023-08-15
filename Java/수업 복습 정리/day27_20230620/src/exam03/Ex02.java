package exam03;

import java.io.File;
import java.io.IOException;

public class Ex02 {
    public static void main(String[] args) throws IOException, InterruptedException {
        File dir = new File("D:" + File.separator + "tmp");
        File file = File.createTempFile("tmp","log",dir); //기본 임시 폴더 / tmp
        System.out.println("getName(): " + file.getName());
        System.out.println("getAbsolutePath" + file.getAbsolutePath()); //처음 경로부터 끝까지 - 절대경로
        file.deleteOnExit();

        // 먼저 삭제되지 않고 모두 끝났을 때 삭제됨. 결국 아래쓰레드 때문에 5초뒤에 가능함.
        Thread.sleep(5000);//  1000 -> 1초

    }
}
