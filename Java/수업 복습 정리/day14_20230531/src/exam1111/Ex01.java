package exam1111;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Ex01 {
    public static void main(String[] args) {
        FileInputStream fis = null;
        try{

            fis = new FileInputStream("a.txt");

            fis.close();
            System.out.println("자원해제1");

        }catch(IOException e) {
            e.printStackTrace();
            try{
                if(fis != null){
                    fis.close();
                }
                System.out.println("자원해제2");

            }catch(IOException e2){

            }
        }
    }
}
