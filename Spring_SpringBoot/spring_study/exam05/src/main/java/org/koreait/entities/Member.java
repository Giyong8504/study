package org.koreait.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.koreait.constants.Role;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="es_member")
@Data
@Builder
@AllArgsConstructor @NoArgsConstructor
public class Member extends BaseEntity{

    @Id @GeneratedValue //증감번호를 자동생성해준다. userNo 추가하지않아도 자동으로 추가해줌.
    private Long userNo;

    @Column(name="memId", length = 40, unique = true, nullable = false)
    private String userId; // memId

    @Column(length = 65, nullable = false)
    private String userPw;

    @Column(length = 40, nullable = false)
    private String userNm;

    @Transient //DB필드로 생성되지 않는다
    private String introduction;

    @Enumerated(EnumType.STRING) //Enum 상수를 의미
    private Role role;

    @OneToMany(mappedBy = "member")
    private List<BoardData> boardDatas = new ArrayList<>();

}
