package controllers.member;

import lombok.Data;

import java.util.List;

@Data
public class JoinForm {
    private String type = "private";  // 값을 입력하게 되면 알아서 선택이 되어있다.
    private String userId;
    private String userPw;
    private String userPwRe;
    private String userNm;
    private String email;
    private String mobile;
//    private String[] hobby;
    private List<String> hobby;
    private Address address;
    private boolean agree;
}
