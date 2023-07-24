package org.koreait;

public class Book2 {
    private String title;
    private String author;
    private String publisher;

    private Book2(){}

    public static Builder builder(){
        return new Builder();
    }

    @Override
    public String toString() {
        return "Book2{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", publisher='" + publisher + '\'' +
                '}';
    }

    static class Builder {
        private Book2 instance = new Book2();

        public Builder title(String title) {
            instance.title = title;

            return this;
        }
        public Builder author(String author) {
            instance.author = author;

            return this;
        }
        public Builder publisher(String publisher) {
            instance.publisher = publisher;

            return this;

        }
        public Book2 build() {
            return instance;
        }
    }
}
