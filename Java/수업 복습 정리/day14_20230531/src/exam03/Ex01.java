package exam03;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Ex01 {
    public static void main(String[] args) {
        FileInputStream fis = null; // 이렇게 밖으로 뺴서 쓰면 try catch 안에서도 사용가능.
        try{ // 자료가 쌓이면 문제가 생기니 적절히 해제해줘야한다
            fis = new FileInputStream("a.txt"); //FileNotFoundException 발생!

            // ↓ 예외가 없을 때만 자원 해제됨!.
            fis.close(); //자원 해제 - IOException 발생한다!
            System.out.println("자원해제1");

        }catch (IOException e) {
            //공통으로 처리할 때 다형성 이용하자.  FileInputStream과 close 의 예외가 다르지만 다형성으로 IOException 으로 한방에 가능
            e.printStackTrace();

            try{
                if(fis != null) {
                    fis.close(); //IOException // 위에 예외가 있을 때도 자원 해제됨! (null값이라면 예외 발생해서 자원해제도안되겠지)
                }
                System.out.println("자원해제2");
            }catch (IOException e2) {}

        }

        //fis.close() - 예외가 발생하든 안하든 항상 수행되는 부분
    }
}
