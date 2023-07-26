package exam01;

import java.util.Optional;

public class Ex07 {
    public static void main(String[] args) {
        Book book = null;
        Optional<Book> opt = Optional.ofNullable(book);
        Book book2 = opt.orElseGet(Book::new); // 생성 람다식
        System.out.println(book2);
    }
}
