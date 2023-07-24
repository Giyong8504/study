package exam01;

import java.util.Optional;

public class Ex04 {
    public static void main(String[] args) {
        Book book = null;
        Optional<Book> opt = Optional.ofNullable(book);
//        Book book2 = opt.orElseGet(() -> new Book());
        Book book2 = opt.orElseGet(Book::new); //명확하게 객체 반환이 하나밖에 없으므로 사용함.
        System.out.println(book2);
        
    }
}
