package exam03;

import java.io.*;

public class Ex02 {
    public static void main(String[] args) {
        try (FileInputStream fis = new FileInputStream("specs.zip");
             BufferedInputStream bis = new BufferedInputStream(fis);
             FileOutputStream fos = new FileOutputStream("specs_copied2.zip");
             BufferedOutputStream bos = new BufferedOutputStream(fos)){
            while(bis.available() > 0) {
                bos.write(bis.read());
            }

        }catch(IOException e) {
            e.printStackTrace();
        }
//           long etime = System.currentTimeMillis()
    }
}
