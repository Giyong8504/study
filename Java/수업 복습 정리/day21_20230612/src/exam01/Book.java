package exam01;

import java.util.Objects;

public class Book implements Comparable<Book>{
    private String title; // 책 제목
    private String author; // 저자
    private String publisher;  // 출판사

    public Book(String title, String author, String publisher) {
        this.title = title;
        this.author = author;
        this.publisher = publisher;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", publisher='" + publisher + '\'' +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(title,author,publisher);
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Book){
            Book book = (Book)obj;
            if(title.equals(book.title) && author.equals(book.author) && publisher.equals(book.publisher)){
                return true;
            }
        }
        return false;
    }

    @Override
    public int compareTo(Book o) {
        /**
         * 숫자 - 오름차순 this. 숫자 - 비교대상. 숫자
         *     - 내림차순 비교대상.숫자 - this.숫자
         */
//        int com = title.compareTo(o.title); // 제목 기준의 오름차순 정렬. 방법.
//        int com = o.title.compareTo(title); // 제목 기준의 내림차순 정렬. 방법.
        int com = title.compareTo(o.title) * -1; // 제목 기준의 내림차순 정렬. 방법.
        return com;

    }
}
