package exam1111;

import java.io.FileInputStream;
import java.io.IOException;

public class Ex02 {
    public static void main(String[] args) {
        try(FileInputStream fis = new FileInputStream("a.txt")){
            System.out.println(fis instanceof AutoCloseable);

        }catch (IOException e) {

        }
    }
}
