package exam02;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.Arrays;

public class Ex08 {
    public static void main(String[] args) {
        byte[] bytes = {'A','B','C','D','E','F'};
        ByteArrayInputStream bis = new ByteArrayInputStream(bytes);
        ByteArrayOutputStream bos = new ByteArrayOutputStream();

        while(bis.available() > 0) {
//            System.out.println((char)bis.read());
            bos.write(bis.read());
        }
        byte[] byte2 = bos.toByteArray(); //방식은 동일하지만 바이트로. 잘은 안씀.
        System.out.println(Arrays.toString(byte2));
    }
}
