package exam02;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class Ex04 {
    public static void main(String[] args) { // 내용의 순서가 바뀌면 제대로 나오지 않는다. 순서가 다르니까!
        try(FileInputStream fis = new FileInputStream("data1.dat");
        DataInputStream dis = new DataInputStream(fis)){
//            int num = dis.readint(); //이렇게 하면 오류 난다.
            byte num = dis.readByte();
            System.out.println(num);

            char ch = dis.readChar();
            System.out.println(ch);

            String str = dis.readUTF(); //문자열가져오기
            System.out.println(str);

        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
