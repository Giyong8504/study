package exam02;

import java.io.IOException;
import java.io.PrintStream;

public class Ex12 {
    public static void main(String[] args) throws IOException {
        System.setErr(new PrintStream("err.log")); // 에러 안난오고 파일로 써지게됨!
        //에러는 별도의 파일로 관리하는게 편하다.

//        throw new RuntimeException("에러 발생!!");

        int result = 10 / 0;
    }

}
