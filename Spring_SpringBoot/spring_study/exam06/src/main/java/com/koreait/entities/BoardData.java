package com.koreait.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data @Builder
@NoArgsConstructor @AllArgsConstructor
public class BoardData extends BaseMemberEntity{

    @Id @GeneratedValue
    private Long Id;
    private String subject;
    private String content;

}
