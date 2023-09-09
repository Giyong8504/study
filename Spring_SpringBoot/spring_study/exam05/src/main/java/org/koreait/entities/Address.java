package org.koreait.entities;

import jakarta.persistence.*;
import jakarta.persistence.GeneratedValue;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data @Builder
@NoArgsConstructor @AllArgsConstructor
public class Address {
    @Id
    @GeneratedValue
    private Long id;

    @Column(length=10)
    private String zonecode;

    @Column(length=100)
    private String address;

    @Column(length=100)
    private String addressSub;

    @OneToOne(mappedBy = "address") // 주인이아님.
    private Member member;
}
