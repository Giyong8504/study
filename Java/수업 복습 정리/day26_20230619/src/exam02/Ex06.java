package exam02;

import java.io.FileReader;
import java.io.IOException;

public class Ex06 {
    public static void main(String[] args) {
        try (FileReader fr = new FileReader("test1.txt")){ //한글이 안꺠짐
            int i = 0;
            while((i= fr.read()) != -1) {
                char ch = (char)i;
                System.out.print(ch);
            }
        }catch (IOException e) {
            e.printStackTrace();
        }
    }
}
