package models.member;

import controllers.member.LoginForm;
import jakarta.servlet.http.HttpSession;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class LoginService {

    private final MemberDao memberDao;
    private final HttpSession session;

    public void login(LoginForm form) {

        /*
        * 1. 회원 정보 조회
        * 2. 세션에 데이터 유지
        * */

    }
}
