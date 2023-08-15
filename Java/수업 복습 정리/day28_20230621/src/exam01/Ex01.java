package exam01;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Ex01 {
    public static void main(String[] args) {
        Book book = new Book("책1","저자1","출판사1",1000);
        Book book2 = new Book("책2","저자2","출판사2",2000);
        String str = "ABC";
        try (FileOutputStream fos = new FileOutputStream("book.obj");
             ObjectOutputStream oos = new ObjectOutputStream(fos)){

            oos.writeObject(str);
            oos.writeObject(book); //문자 형태로 파일을 객체 만들어진거?
            oos.writeObject(book2);

        }catch (IOException e) {
            e.printStackTrace();
        }
    }
}
