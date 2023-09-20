package org.koreait.models.board;

import lombok.RequiredArgsConstructor;
import org.koreait.controllers.board.BoardForm;
import org.koreait.entities.BoardData;
import org.koreait.repositories.BoardDataRepository;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BoardDataSaveService {

    private final BoardDataRepository repository;

    public void save(BoardForm form) {
        BoardData data = BoardData.builder()
                .poster(form.getPoster())
                .subject(form.getSubject())
                .content(form.getContent())
                .build();
        repository.saveAndFlush(data);
    }
}
