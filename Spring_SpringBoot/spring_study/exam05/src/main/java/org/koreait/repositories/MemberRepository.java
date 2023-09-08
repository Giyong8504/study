package org.koreait.repositories;

import com.querydsl.core.BooleanBuilder;
import org.koreait.entities.Member;
import org.koreait.entities.QMember;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.data.repository.query.Param;

import java.util.List;

import static org.springframework.data.domain.Sort.Order.desc;

public interface MemberRepository extends JpaRepository<Member, Long>, QuerydslPredicateExecutor<Member> {
    Member findByUserId(String userId);

    List<Member> findByUserNmContaining(String keyword, Pageable pageable);

    List<Member> findByUserNmContainingOrderByUserIdDesc(String keyword);
    List<Member> findByUserNmContainingOrUserIdContainingOrderByUserIdDesc(String keyword, String keyword2);

    @Query("SELECT m FROM Member m WHERE m.userNm LIKE %:key1% OR m.userId LIKE %:key2% ORDER BY m.userId DESC")
    List<Member> getList(@Param("key1") String keyword1, @Param("key2") String keyword2);

    default List<Member> getList2(String keyword1, String keyword2) {
        QMember member = QMember.member;

        BooleanBuilder builder = new BooleanBuilder(); // and or not
        builder.or(member.userNm.contains(keyword1))
                .or(member.userId.contains(keyword2));

        List<Member> members = (List<Member>)findAll(builder, Sort.by(desc("userId")));
        return members;
    }

    default Member getMember(String userId) {
        QMember member = QMember.member;
        Member data = findOne(member.userId.eq(userId)).orElse(null);
        return data;
    }
}
