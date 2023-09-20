package member;

import commons.BadRequestException;
import commons.RequiredValidator;
import commons.Validator;

public class JoinValidator implements Validator<Member>, RequiredValidator {
    @Override
    public void check(Member member) {
        requiredCheck(member.getUserId(), new BadRequestException("아이디를 입력하세요."));
        requiredCheck(member.getUserPw(), new BadRequestException("비밀번호를 입력하세요."));
        requiredCheck(member.getUserNm(), new BadRequestException("회원명을 입력하세요."));
    }
}
