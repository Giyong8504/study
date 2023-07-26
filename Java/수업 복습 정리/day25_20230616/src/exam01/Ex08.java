package exam01;

import java.util.Optional;

public class Ex08 {
    public static void main(String[] args) {
        Book book = null;
        Optional<Book> opt = Optional.ofNullable(book);
//        Book book2 = opt.orElseThrow(); //get() 동일한 형태
//        Book boo2 = opt.orElseThrow(() -> new BookNotFoundException());
        Book boo2 = opt.orElseThrow(BookNotFoundException::new);
    }
}
