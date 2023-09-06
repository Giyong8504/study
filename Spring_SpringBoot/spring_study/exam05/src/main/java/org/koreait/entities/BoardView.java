package org.koreait.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import lombok.Data;

@Entity
@Data
@IdClass(BoardViewId.class)
public class BoardView {
    @Id
    private Long id; // 게시글 번호

    @Id
    @Column(name="_uid")
    private int uid; // IP + User-Agent : 브라우저 종류
}
