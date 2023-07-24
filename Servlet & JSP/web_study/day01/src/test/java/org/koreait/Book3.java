package org.koreait;

import lombok.Builder;
import lombok.ToString;

@Builder @ToString
public class Book3 {
    @ToString.Exclude
    private String title;
    private String author;
    private String publisher;

}
