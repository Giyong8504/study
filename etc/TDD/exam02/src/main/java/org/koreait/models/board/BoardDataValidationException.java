package org.koreait.models.board;

import org.koreait.commons.CommonException;
import org.springframework.http.HttpStatus;

public class BoardDataValidationException extends CommonException {
    public BoardDataValidationException(String message) {
        super(message, HttpStatus.BAD_REQUEST);
    }
}
