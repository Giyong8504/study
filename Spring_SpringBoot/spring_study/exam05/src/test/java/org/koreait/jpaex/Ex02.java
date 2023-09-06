package org.koreait.jpaex;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.koreait.entities.Member;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;

import java.time.LocalDateTime;

@SpringBootTest
@Transactional
@TestPropertySource(locations = "classpath:application-test.properties")
public class Ex02 {

    @PersistenceContext
    private EntityManager em;

    @BeforeEach
    void init() { //모든 메서드 시작전에 이거먼저 시작되고 시작된다.
        Member member = Member.builder()
                .userNo(1L)
                .userId("user01")
                .userPw("123456")
                .userNm("사용자01")
                .regDt(LocalDateTime.now())
                .build();

        em.persist(member);
        em.flush();
    }

    @Test
    void test1() {
        em.clear();
        Member member = em.find(Member.class, 1L); //SELECT 문 수행 -> 엔티티 -> 영속상태
        System.out.println(member);

        Member member2 = em.find(Member.class, 1L); // 영속성 컨텍스트의 엔터티 조회
        System.out.println(member2);
        System.out.println(member == member2);
    }

    @Test
    void test2() {
        Member member = em.find(Member.class, 1L);
        member.setUserNm("(수정)사용자01");
        //em.flush();

        Member member2 = em.find(Member.class,1L); // flush()가 먼저 수행 자동수행 -> 조회
        System.out.println(member2);
    }
}
