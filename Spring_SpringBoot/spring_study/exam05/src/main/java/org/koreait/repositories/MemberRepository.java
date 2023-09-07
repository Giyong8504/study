package org.koreait.repositories;

import org.koreait.entities.Member;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MemberRepository extends JpaRepository<Member, Long> {
    Member findByUserId(String userId);

    List<Member> findByUserNmContaining(String keyword, Pageable pageable);

    List<Member> findByUserNmContainingOrderByUserIdDesc(String keyword);
    List<Member> findByUserNmContainingOrUserIdContainingOrderByUserIdDesc(String keyword, String keyword2);


}
