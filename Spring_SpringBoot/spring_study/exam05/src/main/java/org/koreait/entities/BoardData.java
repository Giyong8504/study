package org.koreait.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data @Builder
@NoArgsConstructor @AllArgsConstructor
public class BoardData extends BaseEntity {

    @Id
    @GeneratedValue
    private Long id;


    @Column(nullable = false)
    private String subject;

    @Lob
    @Column(nullable = false)
    private String content;

    @ManyToOne
    @JoinColumn(name="userNo")
    @ToString.Exclude
    private Member member;
}

