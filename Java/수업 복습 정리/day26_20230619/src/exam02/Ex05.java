package exam02;

import java.io.FileOutputStream;
import java.io.IOException;

public class Ex05 {
    public static void main(String[] args) {
        try (FileOutputStream fos = new FileOutputStream("test3.txt")){
            fos.write('안');
            fos.write('녕');
            fos.write('하');
            fos.write('세');
            fos.write('요');
            fos.write('!');

        }catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println((int)'안');
    }
}
