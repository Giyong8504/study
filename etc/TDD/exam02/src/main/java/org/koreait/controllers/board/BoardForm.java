package org.koreait.controllers.board;

import lombok.Data;

@Data
public class BoardForm {
    private String poster;
    private String subject;
    private String content;
}
