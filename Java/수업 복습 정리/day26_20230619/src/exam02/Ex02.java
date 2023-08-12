package exam02;

import java.io.FileInputStream;
import java.io.IOException;

public class Ex02 {
    public static void main(String[] args) {
        try(FileInputStream fis = new FileInputStream("test1.txt")){
            while(fis.available() > 0) {
                char ch = (char)fis.read();
                System.out.print(ch);
            }

        }catch (IOException e) {
            e.printStackTrace();
        }
    }
}
