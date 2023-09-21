package org.koreait.models.board;

import org.koreait.commons.CommonException;
import org.springframework.http.HttpStatus;

public class BoardDataNotFoundException extends CommonException {
    public BoardDataNotFoundException() {
        super("등록되지 않은 게시글입니다.", HttpStatus.NOT_FOUND);
    }
}
