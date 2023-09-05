package org.koreait.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Data
@Builder
@AllArgsConstructor @NoArgsConstructor
public class Member {

    @Id
    private Long userNo;
    private String userId;
    private String userPw;
    private String userNm;
    private LocalDateTime regDt;

}
