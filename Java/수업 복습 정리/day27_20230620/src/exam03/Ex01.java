package exam03;

import java.io.File;
import java.io.IOException;

public class Ex01 {
    public static void main(String[] args) throws IOException {
        File file = new File("D:" + File.separator+ "tmp" + File.separator + "test1.txt");
        //이러면 알아서 형식에 맞게 해줌.

        file.createNewFile(); // 빈 파일 생성

//        Thread.sleep(3000);

        file.delete();

    }
}
