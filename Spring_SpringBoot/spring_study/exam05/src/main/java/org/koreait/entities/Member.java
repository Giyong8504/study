package org.koreait.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.koreait.constants.Role;

import java.time.LocalDateTime;

@Entity
@Table(name="es_member")
@Data
@Builder
@AllArgsConstructor @NoArgsConstructor
public class Member {

    @Id @GeneratedValue //증감번호를 자동생성해준다. userNo 추가하지않아도 자동으로 추가해줌.
    private Long userNo;
    private String userId;
    private String userPw;
    private String userNm;

    @Lob
    private String introduction;

    @Enumerated(EnumType.STRING) //Enum 상수를 의미
    private Role role;

    @CreationTimestamp
    private LocalDateTime regDt;

    @UpdateTimestamp
    private LocalDateTime modDt;
}
