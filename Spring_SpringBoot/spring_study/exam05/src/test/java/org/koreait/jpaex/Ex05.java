package org.koreait.jpaex;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.koreait.constants.Role;
import org.koreait.entities.BoardData;
import org.koreait.entities.Member;
import org.koreait.repositories.BoardDataRepository;
import org.koreait.repositories.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;

import java.util.ArrayList;
import java.util.List;

@SpringBootTest
@Transactional //테스트 하나가 끝나면 비워준다.
@TestPropertySource(locations="classpath:application-test.properties")
public class Ex05 {

    @PersistenceContext
    private EntityManager em;

    @Autowired
    private MemberRepository memberRepository;

    @Autowired
    private BoardDataRepository boardDataRepository;


    @BeforeEach
    void init() {
        Member member = Member.builder()
                .userId("user01")
                .userPw("123456")
                .userNm("사용자01")
                .role(Role.USER)
                .build();

        memberRepository.saveAndFlush(member);

        List<BoardData> items = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            BoardData item = BoardData.builder()
                    .subject("제목" + i)
                    .content("내용" + i)
                    .member(member)
                    .build();
            items.add(item);
        }

        boardDataRepository.saveAllAndFlush(items);
        em.clear();
    }

    @Test
    void test1() {
        BoardData data = boardDataRepository.findById(1L).orElse(null);
        Member member = data.getMember(); // 죄회가 안된다.
        String userId = member.getUserId();
        System.out.println(userId);
//        System.out.println(data);
//        Member member = data.getMember();
//        System.out.println(member);
    }

    @Test
    void test2() {
        Member member = memberRepository.findById(1L).orElse(null);
        List<BoardData> items = member.getBoardDatas();
        items.stream().forEach(System.out::println);
    }

    @Test
    void test3() {
        List<BoardData> items = boardDataRepository.findAll();
        for (BoardData item : items) {
            Member member = item.getMember();
            String userId = member.getUserId();
            System.out.println(userId);
        }
    }

    @Test
    void test4() {
        List<BoardData> items = boardDataRepository.getList();
        for (BoardData item : items) {
            Member member = item.getMember();
            String userId = member.getUserId();
            System.out.println(userId);
        }
    }
}