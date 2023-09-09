package org.koreait.jpaex;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.koreait.entities.BoardData;
import org.koreait.entities.HashTag;
import org.koreait.repositories.BoardDataRepository;
import org.koreait.repositories.HashTagRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;

import java.util.ArrayList;
import java.util.List;

@SpringBootTest
@Transactional
@TestPropertySource(locations="classpath:application-test.properties")
public class Ex07 {

    @Autowired
    private BoardDataRepository boardDataRepository;

    @Autowired
    private HashTagRepository hashTagRepository;

    @PersistenceContext
    private EntityManager em;

    @BeforeEach
    void init() {
        List<HashTag> tags = new ArrayList<>();
        for (int i = 1; i <= 5; i++) {
            HashTag tag = new HashTag();
            tag.setTag("태그" + i);
            tags.add(tag);
        }

        hashTagRepository.saveAllAndFlush(tags);


        List<BoardData> items = new ArrayList<>();
        for (int i = 1; i <= 5; i++) {
            BoardData item = BoardData.builder()
                    .subject("제목" + i)
                    .content("내용" + i)
                    .tags(tags)
                    .build();
            items.add(item);
        }

        boardDataRepository.saveAllAndFlush(items);
        em.clear();
    }

    @Test
    void test1() {
        BoardData boardData = boardDataRepository.findById(1L).orElse(null);
        List<HashTag> tags = boardData.getTags();
        System.out.println(tags);
    }

    @Test
    void test2() {
        HashTag tag = hashTagRepository.findById("태그1").orElse(null);
        List<BoardData> items = tag.getBoardData();
        items.stream().forEach(System.out::println);
    }
}