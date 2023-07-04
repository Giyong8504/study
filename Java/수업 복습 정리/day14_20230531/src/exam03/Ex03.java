package exam03;

import java.io.FileInputStream;
import java.io.IOException;

public class Ex03 {
    public static void main(String[] args) { //try - with - resources
        try(FileInputStream fis = new FileInputStream("a.txt")){

            System.out.println(fis instanceof AutoCloseable);

        }catch (IOException e) {
            e.printStackTrace();
        } finally {

        }
    }
}
