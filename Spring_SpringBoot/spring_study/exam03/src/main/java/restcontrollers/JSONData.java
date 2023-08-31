package restcontrollers;

import lombok.Data;
import org.springframework.http.HttpStatus;

@Data
public class JSONData<T> {
    private boolean success;
    private HttpStatus status = HttpStatus.OK; // 200대 코드
    private T data;
    private String message;
}
