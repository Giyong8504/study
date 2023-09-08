package org.koreait.entities;

import jakarta.persistence.Column;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalDateTime;


@Getter @Setter
@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
public abstract class BaseEntity {

    @CreatedDate //처음 추가할 때 등록됨
    @Column(updatable = false) //절대 수정이 안되게막는다. 초기 가입 일자임.
    private LocalDateTime regDt;

    @LastModifiedDate// 수정 날짜가 등록됨.
    @Column(insertable = false) // 수정할 때만 날짜가 입력되게 함.
    private LocalDateTime modDt;
}
