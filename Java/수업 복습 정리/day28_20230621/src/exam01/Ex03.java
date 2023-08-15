package exam01;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Ex03 {
    public static void main(String[] args) { // 객체를 쓸때는 Map 형태로 쓰는게 유리하다.
        Map<String, Object> data = new HashMap<>();
        List<Book> books = new ArrayList<>();
        books.add(new Book("책1", "저자1", "출판사1", 1000));
        books.add(new Book("책2", "저자2", "출판사2", 2000));
        books.add(new Book("책3", "저자3", "출판사3", 3000));

        data.put("books", books);
        data.put("book", new Book("책4","저자4","출판사4",4000));
        data.put("str" , "ABC");

        try(FileOutputStream fos = new FileOutputStream("data.obj");
            ObjectOutputStream oos = new ObjectOutputStream(fos)){

            oos.writeObject(data);

        }catch (IOException e) {
            e.printStackTrace();
        }

    }
}
