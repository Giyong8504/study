package exam1111;

import java.io.FileInputStream;
import java.io.IOException;

public class Ex03 {
    public static void main(String[] args) {
        try(FileInputStream fis1 = new FileInputStream("a.txt")){

            System.out.println(fis1 instanceof AutoCloseable);

        }catch(IOException e){
            e.printStackTrace();

        }

    }
}
