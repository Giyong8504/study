package controllers.member;

import jakarta.validation.constraints.AssertTrue;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class JoinForm {
    private String type = "private";  // 값을 입력하게 되면 알아서 선택이 되어있다.

    @NotBlank //애노테이션명 자체를 오류 코드로 하여 프로퍼티즈에 입력하는게 좋다.
    @Size(min=6, max=16)
    private String userId;

    @NotBlank
    @Size(min=8)
    private String userPw;

    @NotBlank
    private String userPwRe;

    @NotBlank
    private String userNm;

    @Email
    private String email;


    private String mobile;

    @AssertTrue
    private boolean agree;
}
