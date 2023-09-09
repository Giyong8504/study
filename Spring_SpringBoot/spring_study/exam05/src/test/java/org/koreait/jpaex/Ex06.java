package org.koreait.jpaex;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.koreait.constants.Role;
import org.koreait.entities.Address;
import org.koreait.entities.Member;
import org.koreait.repositories.AddressRepository;
import org.koreait.repositories.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;

@SpringBootTest
@Transactional
@TestPropertySource(locations="classpath:application-test.properties")
public class Ex06 {

    @Autowired
    private MemberRepository memberRepository;

    @Autowired
    private AddressRepository addressRepository;

    @PersistenceContext
    private EntityManager em;

    @BeforeEach
    void init() {
        Address address = Address.builder()
                .zonecode("12345")
                .address("주소")
                .addressSub("나머지 주소!")
                .build();
        addressRepository.saveAndFlush(address);

        Member member = Member.builder()
                .userId("user01")
                .userPw("123456")
                .userNm("사용자01")
                .role(Role.USER)
                .address(address)
                .build();

        memberRepository.saveAndFlush(member);
        em.clear();

    }

    @Test
    void test1() {
        Member member = memberRepository.findByUserId("user01");
        System.out.println(member);
        Address address = member.getAddress();
        System.out.println(address);
    }

    @Test
    void test2() {
        Address address = addressRepository.findById(1L).orElse(null);
        Member member = address.getMember();
        System.out.println(member);
    }
}
