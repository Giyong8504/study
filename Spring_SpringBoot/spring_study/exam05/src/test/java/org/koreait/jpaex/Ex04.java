package org.koreait.jpaex;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.koreait.constants.Role;
import org.koreait.entities.Member;
import org.koreait.repositories.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.test.context.TestPropertySource;

import java.util.ArrayList;
import java.util.List;

import static org.springframework.data.domain.Sort.Order.asc;
import static org.springframework.data.domain.Sort.Order.desc;

@SpringBootTest
@Transactional
@TestPropertySource(locations="classpath:application-test.properties")
public class Ex04 {
    @Autowired
    private MemberRepository repository;

    @PersistenceContext
    private EntityManager em;

    @BeforeEach
    void init() {
        List<Member> members = new ArrayList<>();
        for (int i = 1; i <= 10 ; i++) {
            Member member = Member.builder()
                    .userId("user" + i)
                    .userPw("123456")
                    .userNm("사용자" + i)
                    .role(Role.USER)
                    .build();
            members.add(member);
        }
        repository.saveAllAndFlush(members);

    }
    @Test
    void test1() {
        List<Member> members = repository.findAll();
        members.stream().forEach(System.out::println);
    }

    @Test
    void test2() {
        em.clear();
        Member member = repository.findById(1L).orElse(null);

        System.out.println(member);

        repository.delete(member);
        repository.flush();
    }
    @Test
    void test3() {
        Member member = repository.findByUserId("user2");
        System.out.println(member);
    }

    @Test
    void test4() {
        Pageable pageable = PageRequest.of(0,3,
                Sort.by(desc("userId")/*, asc("userNo")*/)); // LIMIT 3, 3
        List<Member> member = repository.findByUserNmContaining("용", pageable);
        member.stream().forEach(System.out::println);
    }

    @Test
    void test5() {
        List<Member> members = repository.findByUserNmContainingOrderByUserIdDesc("용");
        members.stream().forEach(System.out::println);
    }

    @Test
    void test6() {
        List<Member> members = repository.findByUserNmContainingOrUserIdContainingOrderByUserIdDesc("용", "ser");
        members.stream().forEach(System.out::println);
    }

    @Test
    void test7() {
        List<Member> members = repository.getList("용","ser");
        members.stream().forEach(System.out::println);
    }

    @Test
    void test8() {
        List<Member> members = repository.getList("용","ser");
        members.stream().forEach(System.out::println);
    }
}


