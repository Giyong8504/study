package com.koreait.repositories;

import com.koreait.entities.BoardData;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BoardDataRepository extends JpaRepository<BoardData, Long> {
}
