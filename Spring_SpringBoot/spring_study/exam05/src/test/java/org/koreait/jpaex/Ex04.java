package org.koreait.jpaex;

import jakarta.transaction.Transactional;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.koreait.constants.Role;
import org.koreait.entities.Member;
import org.koreait.repositories.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;

import java.util.ArrayList;
import java.util.List;

@SpringBootTest
@Transactional
@TestPropertySource(locations="classpath:application-test.properties")
public class Ex04 {
    @Autowired
    private MemberRepository repository;

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
        Member member = repository.findById(1L).orElse(null);
        System.out.println(member);
    }
}
