package exam01;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public class Ex04 {
    public static void main(String[] args) {
        try(FileInputStream fis = new FileInputStream("data.obj");
            ObjectInputStream ois= new ObjectInputStream(fis)){

            Map<String, Object> data =(Map<String,Object>)ois.readObject();
            List<Book> books = (List<Book>) data.get("books");
            Book book = (Book)data.get("book");
            String str= (String)data.get("str");

            System.out.println("-----------books-----------");
            books.stream().forEach(System.out::println);

            System.out.println("-----------book-----------");
            System.out.println(book);

            System.out.println("-----------str-----------");
            System.out.println(str);


        }catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
