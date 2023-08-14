package exam02;

import java.io.FileInputStream;
import java.io.IOException;

public class Ex03 {
    public static void main(String[] args) {
        try(FileInputStream fis = new FileInputStream("test1.txt")){
            byte [] buffer = new byte[5]; //buffer에 담는게 효율적임
            while (fis.available() > 0) {
                int ch = fis.read(buffer); //데이터가 버퍼에 담겨있음
                for(int i = 0; i < ch; i++) {
                    System.out.println((char)buffer[i]); //이렇게 하면 마지막 읽어온 만큼만 읽어옴
                }

               /* for(byte b : buffer){
                    System.out.print((char)b);
                }*/
                System.out.println();
            }

        }catch (IOException e) {
            e.printStackTrace();
        }
    }
}
//기존데이터를 덮어 쓰는게 효율적이기 때문에 PQ뒤에 출력 내용으로 나옴.
//이미 있는 buffer에다가 씌우기 떄문에 불필요한 데이터가 나온다.
