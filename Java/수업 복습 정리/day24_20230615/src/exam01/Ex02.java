package exam01;

import java.util.function.Supplier;

public class Ex02 {
    public static void main(String[] args) { //용도가 한정적이라 짧게 쓰는 것.
        Book book = new Book("책1", "저자1");

//        Supplier<String> func1 = () -> book.showInfo();
        Supplier<String> func1 = book::showInfo;
        System.out.println(func1.get());

        book.printInfo();
    }
}
