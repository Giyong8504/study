package exam01;

import java.io.*;

public class Ex02 {
    public static void main(String[] args) { //순서가 굉장히 중요하다. 순서가 바뀌면 오류가 난다.
        try(FileInputStream fis = new FileInputStream("book.obj");
            ObjectInputStream ois = new ObjectInputStream(fis)){

            String str = (String)ois.readObject();
            System.out.println(str);

            Book book = (Book)ois.readObject(); // ClassNotFoundException 오류발생
            System.out.println(book);

            Book book2 = (Book)ois.readObject();
            System.out.println(book2);


        }catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

}
