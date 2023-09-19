package tests;

import commons.BadRequestException;
import models.member.JoinService;
import models.member.Member;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import static org.junit.jupiter.api.Assertions.*;

public class JoinServiceTest {

    private JoinService joinService;

    @BeforeEach
    void init() {
        joinService = new JoinService();
    }

    private Member getMember() {
        return Member.builder()
                .userId("user01")
                .userPw("123456")
                .userNm("사용자01")
                .email("user01@test.org")
                .build();
    }

    @Test
    @DisplayName("회원 가입 성공시 예외 발생 없음")
    void joinSuccessTest() {
        assertDoesNotThrow(() -> {
            joinService.join(getMember());
        });
    }

    @Test
    @DisplayName("필수항목(userId, userNm, userPw) 체크, 필수 항목 누락시 BadRequestException 발생")
    void requiredFieldsTest() {
        /** userId의 필수 여부 - null, 빈값이면 예외 발생 */
        requiredFieldEachTest("userId", "아이디");
        requiredFieldEachTest("userPw", "비밀번호");
        requiredFieldEachTest("userNm", "회원명");

    }

    private void requiredFieldEachTest(String field, String word) {
        Member member = getMember();
        if (field.equals("userId")) {
            member.setUserId(null);
        }else if (field.equals("userPw")) {
//            member.setUserPw(null);
        }else if (field.equals("userNm")) {
            member.setUserNm(null);
        }
        BadRequestException thrown = assertThrows(BadRequestException.class, () -> {
            joinService.join(member);
        });

        assertTrue(thrown.getMessage().contains(word));

        if (field.equals("userId")) {
            member.setUserId("   ");
        }else if (field.equals("userPw")) {
            member.setUserPw("   ");
        }else if (field.equals("userNm")) {
            member.setUserNm("   ");
        }
        BadRequestException thrown2 = assertThrows(BadRequestException.class, () -> {
            joinService.join(member);
        });

        assertTrue(thrown2.getMessage().contains(word));

    }
}