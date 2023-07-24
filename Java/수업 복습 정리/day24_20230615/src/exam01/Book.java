package exam01;

import java.util.function.Supplier;

public class Book {
    private String title;
    private String author;
    public Book() {

    }
    public Book(String title, String author){
        this.title = title;
        this.author = author;
    }
    public void printInfo() {
//        Supplier<String> supplier = () -> showInfo();
        Supplier<String> supplier = this::showInfo; //객체안에서  this로도 가능. 실습해보기 위함.
        System.out.println(supplier);
    }

    public String showInfo(){
        return String.format("tilte=%s, author=%s", title, author);
    }
}
