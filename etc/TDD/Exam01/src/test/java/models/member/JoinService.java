package models.member;

import commons.BadRequestException;
import commons.RequiredValidator;

public class JoinService implements RequiredValidator {
    public void join(Member member) {
        requiredCheck(member.getUserId(), new BadRequestException("아이디를 입력하세요."));
        requiredCheck(member.getUserPw(), new BadRequestException("비밀번호를 입력하세요"));
        requiredCheck(member.getUserNm(), new BadRequestException("회원명을 입력하세요."));

    }
}
