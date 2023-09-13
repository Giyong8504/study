package com.koreait.entities;

import com.koreait.commons.Role;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data @Builder
@NoArgsConstructor @AllArgsConstructor
public class Member extends BaseEntity{

    @Id
    @GeneratedValue
    private Long userNo;

    @Column(length = 40, unique = true, nullable = false)
    private String userId;

    @Column(length = 65, nullable = false)
    private String userPw;

    @Column(length = 40, nullable = false)
    private String userNm;

    @Column(length = 100, nullable = false)
    private String email;

    @Column(length = 11)
    private String mobile;

    @Enumerated(EnumType.STRING)
    private Role role = Role.USER;
}
