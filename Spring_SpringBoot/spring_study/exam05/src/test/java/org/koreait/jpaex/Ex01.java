package org.koreait.jpaex;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.junit.jupiter.api.Test;
import org.koreait.entities.Member;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;

import java.time.LocalDateTime;

@SpringBootTest
@Transactional
@TestPropertySource(locations = "classpath:application-test.properties")
public class Ex01 {

    @PersistenceContext
    private EntityManager em;

    @Test
    void test1() {
        Member member = Member.builder()
                .userNo(1L)
                .userId("user01")
                .userPw("123456")
                .userNm("사용자01")
//                .regDt(LocalDateTime.now())
                .build();

        em.persist(member);
        em.flush();

        em.detach(member); // 영속성 분리 -> 변화감지를 안함!

        member.setUserNm("수정(사용자01)"); // update
        em.flush();

        em.merge(member); // 분리된 영속 -> 영속상태 ->변화감지O !!
        em.flush();



        /*
        em.remove(member); // delete
        em.flush();
        */


    }

}
