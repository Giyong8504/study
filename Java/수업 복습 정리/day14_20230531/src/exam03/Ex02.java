package exam03;

import java.io.FileInputStream;
import java.io.IOException;

public class Ex02 {
    public static void main(String[] args) {
        FileInputStream fis = null;
        try{
            fis = new FileInputStream("a.txt"); //FileNotFoundException 발생!

            return; //종료 // 종료해도 finally에서 무조건 수행함.


        }catch (IOException e) { //다형성~
            e.printStackTrace();

        } finally {//예외가 발생하든 안하든 항상 수행 // 자원해제, 로그기록 할때 사용.
            if (fis != null) {
                try{
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("자원해제");
        }   // 쓰는이유 자원을 소비하는 클래스 부분들은 애플리 종료하면 다 종료하지만
        //웹은 항상 켜져있어야 하기때문에 종료되면안된다.
        // 자원이 쌓이면 서버가 다운되기 때문에 반드시 닫아서 자원관리를 해준다.

    }
}
