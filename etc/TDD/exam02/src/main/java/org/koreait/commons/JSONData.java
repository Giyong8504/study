package org.koreait.commons;

import lombok.Data;
import org.springframework.http.HttpStatus;

@Data
public class JSONData<T> {
    private boolean success;
    private T data;
    private String message;
    private HttpStatus status = HttpStatus.OK;
}
