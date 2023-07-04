package exam02;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Ex02 {
    public static void main(String[] args) {
        //throw new FileNotFoundException(....):

        try {
            FileInputStream fis = new FileInputStream("b.txt"); //이건 반드시 예외처리를 해야 컴파일 된다.

            System.out.println("매우 중요한 실행 코드!");

        }catch(FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
