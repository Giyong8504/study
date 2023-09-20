package tests;

import commons.BadRequestException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import member.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.mock;

@DisplayName("로그인 기능 테스트")
@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.WARN)
public class LoginServiceTest {

    private LoginService service;
    private JoinService joinservice;
    @Mock
    private HttpServletRequest request;
    @Mock
    private HttpSession session;
    private Member member;

    @BeforeEach
    void init() {
        service = ServiceManager.getInstance().loginService();
        joinservice = ServiceManager.getInstance().joinService();
        request = mock(HttpServletRequest.class);
        session = mock(HttpSession.class);

        given(request.getSession()).willReturn(session);

        member = Member.builder()
                .userId("user" + System.currentTimeMillis())
                .userPw("12345678")
                .userNm("사용자")
                .email("user@test.org")
                .build();
        joinservice.join(member);

    }

    private void getRequestData(String userId, String userPw) {
        given(request.getParameter("userId")).willReturn(userId);
        given(request.getParameter("userPw")).willReturn(userPw);
    }

    private void getSuccessData() {
        getRequestData(member.getUserId(),member.getUserPw());
    }

    @Test
    @DisplayName("로그인 성공시 예외 없음")
    void loginSuccessTest() {
        getSuccessData();
        service.login(request);
    }

    @Test
    @DisplayName("필수 항목(userId, userPw) 검증, 실패시 BadRequestException발생")
    void requiredFieldTest() {
        assertAll(
                () -> requiredFieldEachTest(null, member.getUserPw(), "아이디"),
                () -> requiredFieldEachTest("    ", member.getUserPw(), "아이디"),
                () -> requiredFieldEachTest(member.getUserId() + System.currentTimeMillis(), null, "비밀번호"),
                () -> requiredFieldEachTest(member.getUserId() + System.currentTimeMillis(), "      ", "비밀번호")
        );
    }

    @Test
    @DisplayName("아이디로 회원이 조회되지 않으면 UserNotFoundException 발생")
    void userExistsTest() {
        assertThrows(UserNotFoundException.class, () -> {
            getRequestData(member.getUserId() + "*", member.getUserPw());
            service.login(request);
        });
    }
    private void requiredFieldEachTest(String userId, String userPw, String word) {
        BadRequestException thrown = assertThrows(BadRequestException.class, () -> {
            getRequestData(userId, userPw);
            service.login(request);
        });

        assertTrue(thrown.getMessage().contains(word));
    }
}