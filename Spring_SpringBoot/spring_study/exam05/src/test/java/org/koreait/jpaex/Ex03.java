package org.koreait.jpaex;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.junit.jupiter.api.Test;
import org.koreait.entities.Member;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;

import java.time.LocalDateTime;

@SpringBootTest
@Transactional
@TestPropertySource(locations = "classpath:application-test.properties")
public class Ex03 {
    @PersistenceContext //오토와일드와 동일
    private EntityManager em;

    @Test
    void test1() {
        Member member = Member.builder()
                .userId("user01")
                .userPw("123456")
                .userNm("사용자01")
                .build();

        em.persist(member);
        em.flush();

        System.out.println(member);
        System.out.printf("regDt : %s, modDt : %s%n", member.getRegDt(),member.getModDt());

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {}

        member.setUserNm("(수정)사용자01");
        em.flush();

        System.out.println(member);
        System.out.printf("regDt : %s, modDt : %s%n", member.getRegDt(),member.getModDt());
    }
}
