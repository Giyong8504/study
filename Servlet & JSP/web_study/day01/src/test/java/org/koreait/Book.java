package org.koreait;

import lombok.*;

//@Getter @Setter @ToString
//@EqualsAndHashCode
@Data
//@AllArgsConstructor
//@RequiredArgsConstructor
//@NoArgsConstructor(access=AccessLevel.PRIVATE)
public class Book {
    private String title;
//    @NonNull
    private String author;
    private String publisher;
}
