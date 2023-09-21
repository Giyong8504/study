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
        String poster = form.getPoster();
        String subject = form.getSubject();
        String content = form.getContent();

        if (poster == null || poster.isBlank()) {
            throw new BoardDataValidationException("작성자를 입력하세요.");
        }
        if (poster == null || subject.isBlank()) {
            throw new BoardDataValidationException("제목을 입력하세요.");
        }
        if (poster == null || content.isBlank()) {
            throw new BoardDataValidationException("내용을 입력하세요.");
        }

        BoardData data = BoardData.builder()
                .poster(poster)
                .subject(subject)
                .content(content)
                .build();
        repository.saveAndFlush(data);
    }
}
